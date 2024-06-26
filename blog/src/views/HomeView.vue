<template>
  <div class="home">
     <TouBu></TouBu>
     <BlogList></BlogList>
  </div>
</template>
<style scoped>
.toubu{
  width: 100%;
}
</style>
<script >
import BlogList from "@/components/BlogList.vue";
import TouBu from "@/components/TouBu.vue";
export default {
  name: 'HomeView',
  components: {
    BlogList,
    TouBu
  }
}
</script>
