<template>
	<div>
		<button @click="increment()">Counter: {{ counter }}</button>
	</div>
</template>

<script>
import { onMounted, ref } from 'vue';

export default {
	setup() {
		const counter = ref(0);
		const increment = () => counter.value++;
		onMounted(() => {
			console.log('애플리케이션이 마운트 되었습니다!');
		});
		return {
			counter,
			increment,
		};
	},
};
</script>
