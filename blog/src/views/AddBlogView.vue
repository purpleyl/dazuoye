<script>
import AddBlog from '@/components/AddBlog.vue'
import TouBu from '@/components/TouBu.vue';

export default {
  name: "AddBlogView",
  components:{
    AddBlog,
    TouBu
  }
}
</script>

<template>
<div class="add">
  <TouBu></TouBu>
  <AddBlog></AddBlog>
</div>
</template>

<style scoped>

</style>
