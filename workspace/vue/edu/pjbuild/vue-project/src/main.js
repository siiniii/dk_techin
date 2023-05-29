import { createApp } from "vue";
import App from "./App.vue";
import router from "./router";
import { createPinia } from "pinia";
import "bootstrap/dist/css/bootstrap.min.css";
import "bootstrap";
import store from "./store_vuex/store";

createApp(App).use(router).use(store).use(createPinia()).mount("#app");
