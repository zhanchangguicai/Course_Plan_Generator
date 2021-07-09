import Vue from 'vue'
import App from './App.vue'
import router from './router'
import store from './store'
import axios from 'axios'
import Element from 'element-ui'
import "element-ui/lib/theme-chalk/index.css"
import "./axios"
import locale from "element-ui/lib/locale/lang/en"
import global_ from "./global.vue"

Vue.config.productionTip = false
Vue.use(Element, {locale})
Vue.prototype.$axios = axios
Vue.prototype.GLOBAL = global_

new Vue({
  router,
  store,
  render: h => h(App)
}).$mount('#app')
