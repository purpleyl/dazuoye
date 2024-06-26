
import Vue from 'vue'
import Vuex from 'vuex'
import CPS from 'vuex-persistedstate'
Vue.use(Vuex)

export default new Vuex.Store({
  state: {
    userid:"",
    username:"",
    haslogin:"",
    item:"",
    clasid:""
  },
  getters: {
  },
  mutations: {
    setusername(state,data){
      this.state.username=data
    },
    setuserid(state,data){
      this.state.userid=data
    },
    sethaslogin(state,data){
      this.state.haslogin=data
    },
    setitem(state,data){
      this.state.item = data
    },
    setclasid(state,data){
      this.state.clasid = data
    },
  },
  actions: {
  },
  modules: {
  },
  plugins:[
    CPS({
      storage:window.sessionStorage
    })
  ]
})
