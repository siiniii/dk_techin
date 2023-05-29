import { defineStore } from "pinia";
import { ref } from "vue";
import axios from "axios";

export const weatherStore = defineStore("weather", () => {
	const time = ref("");

	function getWeather() {
		axios
			.get("http://localhost:8088/weather")
			.then((res) => {
				// 성공 핸들링
				time.value = res.data.time;
			})
			.catch((err) => {
				// 에러 핸들링
				console.log(err);
			});
	}
	return { time, getWeather };
});
