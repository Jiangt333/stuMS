<template>
  <meta charset="charset=utf-8"/>
    <div class="bgimg">
      <div>
        <el-card class="card">
          <el-input v-model="input_account" class="account" placeholder="账号"/>
          <el-input v-model="input_password" class="password" type="password" placeholder="密码"/>
          <el-button class="login" @click="call_login()">
          登录
          </el-button>
          <el-button class="getpass">
          忘记密码
          </el-button>
          <el-button class="help">
          需要帮助
          </el-button>
        </el-card>
      </div>
    </div>

</template>
  
<script  setup>
import {ref} from 'vue'
import {useRoute, useRouter} from 'vue-router'
import '../api/mock.js'
import {Test} from '../api/api.js'

const router = useRouter()
const route = useRoute()
let input_account = ref('')
let input_password = ref('')

const call_login = () =>{
  let body = { 'user_input': input_account, 'password': input_password };
  // 向mockjs发起请求
  Test().then(response => {
    console.log(response.data);
  }).catch(error => {
    if(error==101)
    {
      router.push('/home');
    }
    else{
      console.error('Error:', error);
    }
  });

  // let response = await GetUser();
  // if (response.ok) {
  //   // 服务器JSON 对象 { "exists": true/false, "correctPassword": true/false }
  //   let data = await response.json();
  //   if (data.exists && data.correctPassword) {
  //     localStorage.setItem('jwtToken', jwtToken);
  //     router.push('/home');
  //   } 
  //   else if(!data.exists)
  //   {
  //     alert("用户不存在");
  //   }
  //   else{
  //     alert("密码错误");
  //   }
  // } 
  // else {
  //   alert("HTTP-Error: " + response.status);
  // }
}

</script>

<style scoped>
.bgimg{
  position: fixed;
  height: 100%;
  width: 100%;
  background-image: url('../assets/body.jpg');
  background-size:100% 100%;
}

.login{
  /* margin-top:5%;
  margin-left: 10%;
  margin-right: 10%;
  height: 3rem;
  width: 80%;
  font-size: 1.2rem; */
  position: absolute;
  left: 59px;
  top: 147.59px;
  width: 280px;
  height: 52.03px;
  border-radius: 10px;
  opacity: 1;
  border: none;
  background-color: rgba(12, 64, 196, 0.58);
  font-size: 18px;
  color: aliceblue;
  
}
.account{
  position: absolute;
  left: 59px;
  top: 31px;
  width: 280px;
  height: 38px;
  opacity: 1;
}
.password{
  position: absolute;
  left: 59px;
  top: 86px;
  width: 281px;
  height: 38.22px;
  opacity: 1;
}
.getpass{
  position: absolute;
  left: 45px;
  top: 224px;
  width: 90px;
  height: 28px;
  opacity: 1;
  border: none;
  font-family: DM Sans;
  font-size: 18px;
  font-weight: bold;
  line-height: 26px;
  text-align: center;
  letter-spacing: 0px;
  font-size: 15px;
  color: rgba(35, 101, 255, 0.6)
}
.help{
  position: absolute;
  left: 240px;
  top: 224px;
  width: 90px;
  height: 28px;
  opacity: 1;
  border: none;
  font-family: DM Sans;
  font-size: 18px;
  font-weight: bold;
  line-height: 26px;
  text-align: center;
  letter-spacing: 0px;
  font-size: 15px;
  color: rgba(35, 101, 255, 0.6);
}

.card{
  /* margin-top:15%;
  margin-left: 60%;
  opacity: 80%;
  width: 23%;
  height: 15rem; */
  position: absolute;
  left: 904px;
  top: 253px;
  width: 399px;
  height: 275px;
  opacity: 1;
  color: aliceblue;
}
</style>
  