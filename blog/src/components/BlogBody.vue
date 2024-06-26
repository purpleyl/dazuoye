<script lang="ts">
import axios from 'axios';


export default {
  name: "BlogBody",
  data(){
    return{
      blog:{
      },
      comments:[
      ],
      addcom:"",
      classes:""
    }
  },
  methods:{
    findbody(){
      this.blog= this.$store.state.item
    },
    findcomments(){
      // axios.get("/blog/comt/list",{
      axios.get("http://112.124.2.92:8080/comt/list",{
        params:{
          contentid:this.blog.id
        }
      })
      .then(Response=>{
        this.comments=Response.data.data
      })
    },
    fbpl(){
      if(this.$store.state.username !=""){
        // axios.post("/blog/add/comt",{
        axios.post("http://112.124.2.92:8080/add/comt",{
        username : this.$store.state.username,
        comment:this.addcom,
        contentid:this.blog.id
       }).then(()=>{
        location.reload();
       })
    }else{
      this.$message.error("请登陆后在发表评论")
    }
      },
    getclas(){
      // axios.get("/blog/cs/csbyid",{
      axios.get("http://112.124.2.92:8080/cs/csbyid",{
        params:{
         id:this.blog.cid,
        }
    }
  ).then(Response=>{
    this.classes=Response.data.clas

  })

    }

  },
  mounted(){
    this.findbody();
    this.findcomments();
    this.getclas();
  },
//   created(){
//   this.blog= this.$store.state.item
//  }

  }
</script>

<template>
<div class="BlogBody">
  <div>
     <h1>{{blog.title}}</h1>
     <label>作者</label><br>
     <label>{{blog.auauthor}}</label><br>
     <label> 分类:</label><label v-for="item in classes" :key="item.id">{{ item.clas }}</label>
  </div>
  <div style="margin-top: 50px;">
    <article style="margin: 0 auto; width: 60%;">
      {{blog.content}}
    </article>
  </div>
      <div style="margin: 0 auto; width: 40%;">
        <h1>评论</h1>
        <div v-for="item in comments" :key="item.id" style="display: flex; height: 100px; background-color: aliceblue; margin-top: 50px;" >
        <div  style="width: 30%; text-align: center; float: left; padding: 50px;">
         用户: {{ item.username }}
        </div>
        <div style="width: 70%; text-align: center;float: left;padding: 50px;">
        {{ item.comment }}
        </div>
        </div>
      </div>

      <div style="margin: 0 auto; width: 40%;">
          <textarea  style="border: 1px solid; width: 40%; margin: 0 auto; margin-top: 50px; resize: none;" v-model="addcom">
          </textarea><br>
          <el-button round  @click="fbpl">发表评论</el-button>
      </div>



</div>
</template>

<style scoped>

</style>
