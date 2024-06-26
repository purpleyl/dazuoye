<script>
import axios from "axios";


export default {

  name: "BlogList",
  data(){
    return{
      contentlist:[],
    }
  },
  methods:{
    alllist(){
      // axios.get("/blog/content/list")
      axios.get("http://112.124.2.92:8080/content/list")
          .then(response =>{
            this.contentlist=response.data.contentList
      })
    },
    findbody(item){

      this.$store.commit("setitem",item)

      this.$router.push({name:"body"})


    }
  },
  mounted(){
    this.alllist();
  }
}
</script>

<template>
<div class="BlogList">
   <h1>博客总览</h1>
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
