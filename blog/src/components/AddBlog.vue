<script>
import axios from 'axios';

export default {
  name: "AddBlog",
  data(){
    return {
      title:"",
      content:"",
      index:"",
     val:""
    }
  },
  methods:{
    fabu(){
        if(this.content == "" || this.title == ""){
          this.$message.error("标题或内容不能为空")
        }else{
          // axios.post("/blog/add/addblog",{
          axios.post("http://112.124.2.92:8080/add/addblog",{
            title:this.title,
            content:this.content,
            auauthor:this.$store.state.username,
            cid:this.val
          }).then(Response=>{
            if(Response.data.code=="200300"){
              this.$message.success("发布成功")
              this.$router.push({name:"home"})
            }else{
              this.$message.error("发布失败")
            }
          })
        }
    },

  }
}
</script>

<template>
<div class="add-blog">
  <form>
    <h1>发表博客</h1>
    <label>博客标题：</label><input v-model="title"><br>
    <label>分类</label><br>

        <input type="radio" id="java" name="fenlei" value="1" v-model="val">
        <label for="java">java</label><br>
        <input type="radio" id="python" name="fenlei" value="2"  v-model="val">
        <label for="python">python</label><br>


    <label>博客内容</label><br>
    <textarea v-model="content" contenteditable="true" style="width: 60%; margin: auto; border: 1px solid; height: 600px;   direction:ltr;text-align: start; resize: none"></textarea>
    <button type="button" @click="fabu">发表</button>
  </form>

</div>
</template>

<style scoped>

</style>
