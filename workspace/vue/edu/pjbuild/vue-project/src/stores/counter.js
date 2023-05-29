// stores/counter.js
import { defineStore } from "pinia";

export const useCounterStore = defineStore("counter", {
	state: () => {
		return { count: 0, name: "김정현" };
	},
	// could also be defined as
	// state: () => ({ count: 0 })
	getters: {
		getName: (state) => state.name + "!!",
	},
	actions: {
		increment() {
			this.count++;
		},
	},
});
