<template>
	<div class="work"><h1>이승인의 Vue 실습 페이지</h1></div>
	<div class="d-flex">
		<TeamCard
			v-for="(item, index) in teamList"
			:name="item.name"
			:food="item.food"
			:team-num="1"
			:src-url="item.srcUrl"
			:key="item.id"
			@clicked-card="clickedCard(index)"
		/>
	</div>
</template>

<script setup>
	import TeamCard from "@/components/TeamCard.vue";

	import { reactive } from "vue";

	const teamList = reactive([
		{
			id: 0,
			name: "김예원",
			food: "토레타",
			srcUrl: "images/cloud.png",
			flag: true,
		},
		{
			id: 1,
			name: "이권석",
			food: "제육",
			srcUrl: "images/rain.png",
			flag: true,
		},
		{
			id: 2,
			name: "이승인",
			food: "곱창",
			srcUrl: "images/snow.png",
			flag: true,
		},
		{
			id: 3,
			name: "홍종민",
			food: "피자",
			srcUrl: "images/sun.png",
			flag: true,
		},
	]);
	function clickedCard(index) {
		console.log(index);

		teamList.splice(index, 1);
	}
</script>
<style>
	.work {
		color: blue;
	}
</style>
