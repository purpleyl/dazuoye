<script>
import axios from "axios"

export default {
  data() {
    return {
      activeIndex: '/',
      haslogin: false,
      dialogFormVisible: false,
      FormVisible: false,
      form: {
        username: '',
        password: '',
      },
      form1: {
        username: '',
        password1: '',
        password2: ''
      },
      formLabelWidth: '120px',
      username: "",
      userid:"",
      classes:""
    }
  },
  methods: {
    handleSelect(key) {
      this.activeIndex = key;
    },
    tuichu(){
      this.$message.success("退出成功")
      this.haslogin=false
      this.username=""
      this.$store.commit("sethaslogin",this.haslogin)
      this.$store.commit("setusername",this.username)
    },
    login() {
      if (this.form.username == "" || this.form.password == "") {
        this.$message.error("用户名或密码不能为空")
      } else {
        // axios.post("/blog/l/login", {
        axios.post("http://112.124.2.92:8080/l/login", {
          username: this.form.username,
          password: this.form.password

        }).then(response =>{
          if (response.data.code == "400100") {
            this.$message.error(response.data.msg)

          } else if (response.data.code == "200100") {
            this.$message.success(response.data.msg)
            this.haslogin=true
            this.dialogFormVisible=false
            this.form.username=""
            this.form.password=""
            this.user=response.data.data
            this.$store.commit("setusername",this.user.username)
            this.$store.commit("setuserid",this.user.userid)
            this.$store.commit("sethaslogin",this.haslogin)
          }
        })
      }

    },
   zhuce(){
     if (this.form1.username == "" || this.form1.password1 == "" || this.form1.password2 == "") {
       this.$message.error("注册内容不能为空")
     }else if(this.form1.password1 != this.form1.password2){
       this.$message.error("密码不一致")
     }else{
       // axios.post("/blog/l/zhuce", {
       axios.post("http://112.124.2.92:8080/l/zhuce", {
         username: this.form1.username,
         password: this.form1.password1
       }).then(response =>{
         if(response.data.code == "400200"){
           console.log(response)
           this.$message.error(response.data.msg)
         }else if(response.data.code == "200200"){
           this.$message.success(response.data.msg)
           this.dialogFormVisible=true
           this.FormVisible = false
           this.form1.username=""
           this.form1.password1=""
           this.form1.password2=""

         }
       })
     }
   },
   addblog(){
    this.$router.push({name:"add"})
   },
   getclass(){
      // axios.get("blog/cs/getclass").then(response=>{
      axios.get("http://112.124.2.92:8080/cs/getclass").then(response=>{
      this.classes=response.data.clas
   })
   },
   setclas(){
    this.$store.commit("setclasid",this.$route.query)
     location.reload()
   }
  },
 created(){
  this.haslogin = this.$store.state.haslogin
  this.username = this.$store.state.username
  this.userid=this.$store.state.id
 },
 mounted(){
    this.getclass();
  }


}
</script>

<template>
  <div>
    <div style="width: 100% ; height: 60px ;text-align: center">
      <div style="float: left">
        <el-menu :default-active="activeIndex" :router="true" mode="horizontal" class="el-menu-demo"
                 @select="handleSelect">
          <el-menu-item index="/"><i class="el-icon-s-home"></i>首页</el-menu-item>

          <el-submenu index='/share'>
            <template slot="title">分类</template>
              <el-menu-item v-for="item in classes" :key="item.id" :index="'/share?clasid='+ item.id "  @click="setclas">{{item.clas}}</el-menu-item>
          </el-submenu>



        </el-menu>
      </div>
      <div style="float: right;margin-top: 10px ;margin-right: 20px">
        <div v-show="!haslogin">
          <el-button type="text" @click="dialogFormVisible = true">登录</el-button>
          <el-dialog
              title="登录"
              :visible.sync="dialogFormVisible">
            <el-form :model="form">
              <el-form-item label="用户名" :label-width="formLabelWidth">
                <el-input v-model="form.username" autocomplete="off"></el-input>
              </el-form-item>
              <el-form-item label="密码" :label-width="formLabelWidth">
                <el-input type="password" v-model="form.password" autocomplete="off"></el-input>
              </el-form-item>
            </el-form>
            <div slot="footer" class="dialog-footer">
              <el-button @click="dialogFormVisible = false; FormVisible=true">注册</el-button>
              <el-button type="primary" @click="login">登录</el-button>
            </div>
          </el-dialog>

          <el-dialog
              title="注册"
              :visible.sync="FormVisible">
            <el-form :model="form1">
              <el-form-item label="用户名" :label-width="formLabelWidth">
                <el-input v-model="form1.username" autocomplete="off"></el-input>
              </el-form-item>
              <el-form-item label="密码" :label-width="formLabelWidth">
                <el-input type="password" v-model="form1.password1" autocomplete="off"></el-input>
              </el-form-item>
              <el-form-item label="确认密码" :label-width="formLabelWidth">
                <el-input type="password" v-model="form1.password2" autocomplete="off"></el-input>
              </el-form-item>
            </el-form>
            <div slot="footer" class="dialog-footer">
              <el-button @click="FormVisible = false ">取消注册</el-button>
              <el-button type="primary" @click="zhuce">确认注册</el-button>
            </div>
          </el-dialog>

        </div>
        <div v-show="haslogin">


          <!-- <el-button icon="el-icon-user-solid" circle ></el-button> -->
          <el-button type="primary" icon="el-icon-edit" circle @click="addblog"></el-button>
          <el-button type="text" @click="tuichu">退出登录</el-button>

        </div>
      </div>

    </div>


  </div>
</template>

<style scoped>
el-menu {
  background-color: transparent;
}

</style>
