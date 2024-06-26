<script>


import axios from "axios";

export default {

  name: "ShareList",
  data(){
    return{
    index:"",
    contentlist:[],
    }
  },
  methods:{
    alllist(){
     this.index=this.$store.state.clasid

     // axios.get("/blog/content/flist",{
     axios.get("http://112.124.2.92:8080/content/flist",{
        params:{
            id:this.index.clasid
        }
     }).then(Response=>{
        this.contentlist = Response.data.contentList
     })
    },
    findbody(item){

      this.$store.commit("setitem",item)
      this.$router.push({name:"body"})


    }
  },
  created(){
    this.alllist();

  }
}
</script>

<template>
<div class="ShareList">
   <h1 >分类</h1>
   <div class="singblog" v-for="item in contentlist" :key="item.id" @click="findbody(item)">
     <h2>{{item.title}}</h2>
   </div>
</div>
</template>

<style scoped>
.BlogList{
  width: 800px;
  max-width: 800px;
  margin: 0 auto;
}
.singblog {
  padding: 20px;
  margin: 20px 0;
  box-sizing: border-box;
  background-color: #eee;
}
.singblog:hover{
background-color: #dcdcee;
}

</style>
