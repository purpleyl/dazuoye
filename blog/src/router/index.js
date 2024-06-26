import Vue from 'vue'
import VueRouter from 'vue-router'
import HomeView from '../views/HomeView.vue'
import BodyView from '@/views/BodyView.vue'
import AddBlogView from '@/views/AddBlogView.vue'
import ShareView from '@/views/ShareView.vue'
Vue.use(VueRouter)

const routes = [
  {
    path: '/',
    name: 'home',
    component: HomeView,

  },
  {
    path:"/body",
    name: 'body',
    component:BodyView,
  },
  {
    path:"/add",
    name: 'add',
    component:AddBlogView,
  },
  {
    path:"/share",
    name:"share",
    component:ShareView,
  }


]

const router = new VueRouter({
  routes
})

export default router

