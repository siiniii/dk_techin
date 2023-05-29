<template>
	<!-- Access the state directly from the store -->
	<div>현재 값: {{ counter.count }}</div>
</template>

<script setup>
	import { useCounterStore } from "@/stores/counter";

	const counter = useCounterStore();
	console.log(counter);
	counter.count++;
	console.log("counter.count++ = " + counter.count);
	// with autocompletion ✨
	counter.$patch({ count: counter.count + 1 });
	console.log(
		"counter.$patch({ count: counter.count + 1 }) = " + counter.count
	);
	// or using an action instead
	counter.increment();
	console.log("counter.increment() = " + counter.count);
</script>
