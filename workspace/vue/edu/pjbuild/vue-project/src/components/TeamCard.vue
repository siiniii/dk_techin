<template>
	<div class="card" style="width: 18rem; margin: auto">
		<img
			v-bind:src="srcUrl"
			class="card-img-top"
			width="70"
			height="200"
			alt="..."
		/>
		<div class="card-body">
			<h5 class="card-title">{{ name }}</h5>
			<p class="card-text">{{ food }}</p>
			<button class="btn btn-primary" @click="clickedCard(name)">
				OK
			</button>
		</div>
	</div>
</template>
<script setup>
	import { weatherStore } from "@/stores/weather";
	import { defineEmits, defineProps } from "vue";

	const p = defineProps({
		name: String,
		food: {
			type: String,
			default: "밥",
		},
		srcUrl: String,
		teamNum: Number,
	});

	const weather = weatherStore();
	weather.getWeather();
	function clickedCard() {
		alert(
			`${p.teamNum}팀 입니다~~~!! 오늘의 날씨는 ${weather.time}입니다.`
		);
		emit("clicked-card");
	}

	const emit = defineEmits(["clicked-card"]);
</script>
