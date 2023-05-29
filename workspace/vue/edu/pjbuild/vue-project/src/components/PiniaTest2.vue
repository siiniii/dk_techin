<template>
	<h3>Option API 스타일의 스토아</h3>
	<div>num1: {{ num1 }}</div>
	<div>num2: {{ num2 }}</div>
	<div>num2: {{ store1.count }}</div>
	<button @click="store1.count++">1 증가(연산식)</button>
	<button @click="store1.increment">1 증가(action 호출)</button>
	<div>현재 값: {{ store1.count }}</div>
	<hr />
	<h3>Composition API 스타일의 스토아</h3>
	<div>친구 이름: {{ name }}</div>
	<div>친구 나이 : {{ age }}</div>
	<button @click="store2.updateAge(5)">친구나이변경</button>
	<button @click="age++">+</button>
</template>

<script setup>
	import { useCounterStore } from "@/stores/counter";
	import { useFriendStore } from "@/stores/friendstore";
	import { storeToRefs } from "pinia";

	const store1 = useCounterStore();
	let num1 = store1.count;
	console.log("store1.count = " + store1.count);
	store1.increment();
	console.log("store1.increment = " + store1.count);
	let num2 = store1.count;

	const store2 = useFriendStore();
	const { name, age } = storeToRefs(store2);
</script>
