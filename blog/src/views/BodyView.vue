<script lang="ts">
import TouBu from "@/components/TouBu.vue";
import BlogBody from '@/components/BlogBody.vue'
export default {
  name: "BodyView",
  components: {
    TouBu,
    BlogBody
  },

}
</script>

<template>
<div class="BodyView">
 <TouBu></TouBu>
  <BlogBody ></BlogBody>
</div>
</template>

<style scoped>

</style>
