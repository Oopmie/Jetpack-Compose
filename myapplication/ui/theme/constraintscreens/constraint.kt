package com.example.myapplication.ui.theme.constraintscreens

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.ExtendedFloatingActionButton
import androidx.compose.material3.FloatingActionButtonDefaults
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.OutlinedTextFieldDefaults
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ImageBitmap
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.imageResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.constraintlayout.compose.ConstraintLayout
import androidx.constraintlayout.compose.Dimension



@Composable
fun ConstraintLayoutWelcome() {
    ConstraintLayout(Modifier.fillMaxSize()) {
        val (image1,text1,text2,text3,textfield1,text4,textfield2,button1,text5,text6,button2,button3) = createRefs()
        Image(bitmap = ImageBitmap.imageResource(id = com.example.myapplication.R.drawable.hand),
                     contentDescription = "hand", modifier = Modifier.size(37.dp).constrainAs(image1){
                         start.linkTo(parent.start, 25.dp)
                         top.linkTo(parent.top, 100.dp)
                     })
        Text("Добро пожаловать!", fontSize = 28.sp, fontWeight = FontWeight.Bold,
                     modifier = Modifier.width(280.dp).constrainAs(text1){
                         bottom.linkTo(image1.bottom)
                         start.linkTo(image1.end, 20.dp)
                     })
        Text(text = "Войдите, чтобы пользоваться функциями приложения", fontSize = 16.sp, modifier = Modifier.width(340.dp).constrainAs(text2){
                         start.linkTo(parent.start, 25.dp)
                         top.linkTo(image1.bottom, 30.dp)
                     })
        Text(text = "Вход по E-mail", color = Color(0xFF7E7E9A) ,fontSize =16.sp, modifier = Modifier.constrainAs(text3){
                         top.linkTo(text2.bottom, 80.dp)
                         start.linkTo(parent.start, 25.dp)
                     })
        val message= remember{ mutableStateOf("") }
        OutlinedTextField(message.value,
            {message.value=it}, shape = RoundedCornerShape(10.dp) ,textStyle = TextStyle(fontSize = 16.sp),
            placeholder = {Text("example@mail.com", color = Color(0xFFBFC7D1))},
            colors = OutlinedTextFieldDefaults.colors(
                unfocusedContainerColor = Color(0xFFF5F5F9),
                unfocusedBorderColor = Color(0xFFEBEBEB),
                focusedContainerColor = Color(0xFFF5F5F9),
                focusedBorderColor = Color(0xFFEBEBEB),
            ),
            modifier = Modifier.constrainAs(textfield1){
                start.linkTo(parent.start, 25.dp)
                top.linkTo(text3.bottom, 7.dp)
                end.linkTo(parent.end, 25.dp)
                width = Dimension.fillToConstraints
            })
        Text(text = "Пароль", color = Color(0xFF7E7E9A) ,fontSize =16.sp, modifier = Modifier.constrainAs(text4){
            top.linkTo(textfield1.bottom, 20.dp)
            start.linkTo(parent.start, 25.dp)
        })
        val message1= remember{ mutableStateOf("") }
        OutlinedTextField(message1.value,
            {message1.value=it}, shape = RoundedCornerShape(10.dp) ,textStyle = TextStyle(fontSize = 16.sp),
            colors = OutlinedTextFieldDefaults.colors(
                unfocusedContainerColor = Color(0xFFF5F5F9),
                unfocusedBorderColor = Color(0xFFEBEBEB),
                focusedContainerColor = Color(0xFFF5F5F9),
                focusedBorderColor = Color(0xFFEBEBEB),
            ),
            modifier = Modifier.constrainAs(textfield2){
                start.linkTo(parent.start, 25.dp)
                top.linkTo(text4.bottom, 7.dp)
                end.linkTo(parent.end, 25.dp)
                width = Dimension.fillToConstraints
            })
        Button(onClick = {},
            shape = RoundedCornerShape(10.dp),
            colors = ButtonDefaults.buttonColors(containerColor = Color(0xFF1A6FEE)),
            modifier = Modifier.height(57.dp).constrainAs(button1){
                top.linkTo(textfield2.bottom, 13.dp)
                start.linkTo(parent.start, 25.dp)
                end.linkTo(parent.end, 25.dp)
                width = Dimension.fillToConstraints
            }) {
            Text("Далее", fontSize = 18.sp)
        }
        TextButton ({}, modifier = Modifier.fillMaxWidth(1f).constrainAs(text5){
            top.linkTo(button1.bottom)
        }) {
        Text("Зарегистрироваться", color = Color(0xFF2074F2),fontSize = 16.sp, textAlign = TextAlign.Center)}
        Text("Или войдите с помощью", color = Color(0xFF939396), fontSize = 16.sp, textAlign = TextAlign.Center,
            modifier = Modifier.fillMaxWidth().constrainAs(text6){
                top.linkTo(text5.bottom,40.dp)
            })
        Button(onClick = {},
            shape = RoundedCornerShape(10.dp),
            colors = ButtonDefaults.buttonColors(containerColor = Color.White),
            border = BorderStroke(1.dp, Color(0xFFEBEBEB)),
            modifier = Modifier.height(57.dp).constrainAs(button2){
                top.linkTo(text6.bottom, 13.dp)
                start.linkTo(parent.start, 25.dp)
                end.linkTo(parent.end, 25.dp)
                width = Dimension.fillToConstraints
            }) {Image(bitmap = ImageBitmap.imageResource(id = com.example.myapplication.R.drawable.vk), contentDescription = "vk",
            modifier = Modifier.size(30.dp,30.dp)
        )
            Spacer(modifier = Modifier.width(15.dp))
            Text("Войти с VK", fontSize = 18.sp, color = Color.Black)
        }
        Button(onClick = {},
            shape = RoundedCornerShape(10.dp),
            colors = ButtonDefaults.buttonColors(containerColor = Color.White),
            border = BorderStroke(1.dp, Color(0xFFEBEBEB)),
            modifier = Modifier.height(57.dp).constrainAs(button3){
                top.linkTo(button2.bottom, 13.dp)
                start.linkTo(parent.start, 25.dp)
                end.linkTo(parent.end, 25.dp)
                width = Dimension.fillToConstraints
            }) {Image(bitmap = ImageBitmap.imageResource(id = com.example.myapplication.R.drawable.yandex), contentDescription = "yd",
                modifier = Modifier.size(30.dp,30.dp)
        )
            Spacer(modifier = Modifier.width(15.dp))
            Text("Войти с Yandex", fontSize = 18.sp, color = Color.Black)
        }
    }
}

@Composable
fun ConstraintLayoutCards(){
    ConstraintLayout(modifier = Modifier.fillMaxSize()) {
        val (textfield11,text11,box11,text22,box22,box33)=createRefs()
        val message= remember{ mutableStateOf("") }
        OutlinedTextField(message.value,
            {message.value=it}, leadingIcon = {Image(bitmap = ImageBitmap.imageResource(com.example.myapplication.R.drawable.icons), contentDescription = "icons",
                modifier = Modifier.size(20.dp))}, shape = RoundedCornerShape(10.dp) ,textStyle = TextStyle(fontSize = 16.sp),
            placeholder = {Text("Искать  описания",
                color = Color(0xFF939396))},
            colors = OutlinedTextFieldDefaults.colors(
                unfocusedContainerColor = Color(0xFFF5F5F9),
                unfocusedBorderColor = Color(0xFFEBEBEB),
                focusedContainerColor = Color(0xFFF5F5F9),
                focusedBorderColor = Color(0xFFEBEBEB),
            ),
            modifier = Modifier
                .height(50.dp)
                .constrainAs(textfield11) {
                    start.linkTo(parent.start, 25.dp)
                    top.linkTo(parent.top, 70.dp)
                    end.linkTo(parent.end, 25.dp)
                    width = Dimension.fillToConstraints
                })
        Text("Акции и новости", fontSize = 18.sp, color = Color(0xFF939396),
            modifier = Modifier.constrainAs(text11){
                top.linkTo(textfield11.bottom, 30.dp)
                start.linkTo(parent.start, 25.dp)
            })

        Row (Modifier
            .horizontalScroll(rememberScrollState())
            .constrainAs(box11) {
                top.linkTo(text11.bottom, 17.dp)
            }) {
            val gradientBrush1 = Brush.linearGradient(
                0.0f to Color(0xFF97D9F0),
                1.0f to Color(0xFF92E9D4))
            val gradientBrush2 = Brush.linearGradient(
                0.0f to Color(0xFF76B3FF),
                1.0f to Color(0xFFCDE3FF)
            )
            Spacer(modifier = Modifier.width(25.dp))
            Card(modifier = Modifier.size(250.dp,150.dp)
            ) {
                Row(
                    modifier = Modifier
                        .background(gradientBrush1)
                        .size(250.dp, 150.dp)
                ) {
                    Column() {
                        Text(
                            "Шорты \n" + "Вторник",
                            color = Color.White,
                            fontSize = 20.sp,
                            modifier = Modifier.padding(15.dp)
                        )
                        Spacer(modifier = Modifier.height(20.dp))
                        Text(
                            "4000 ₽ ",
                            color = Color.White,
                            fontSize = 20.sp,
                            modifier = Modifier.padding(15.dp)
                        )
                    }
                    Image(bitmap = ImageBitmap.imageResource(com.example.myapplication.R.drawable.covid), contentDescription = "covid",
                        modifier = Modifier.size(150.dp),
                        contentScale = ContentScale.Crop)
                }
            }
            Spacer(modifier = Modifier.width(25.dp))
            Card(modifier = Modifier.size(260.dp,150.dp)
            ) {
                Row(
                    modifier = Modifier
                        .background(gradientBrush2)
                        .size(260.dp, 150.dp)
                ) {
                    Column() {
                        Text(
                            "Рубашка\n Воскресенье",
                            color = Color.White,
                            fontSize = 20.sp,
                            modifier = Modifier.padding(15.dp)
                        )
                        Spacer(modifier = Modifier.height(20.dp))
                        Text(
                            "8000 ₽ ",
                            color = Color.White,
                            fontSize = 20.sp,
                            modifier = Modifier.padding(15.dp)
                        )
                    }
                    Image(bitmap = ImageBitmap.imageResource(com.example.myapplication.R.drawable.man), contentDescription = "man",
                        modifier = Modifier.size(150.dp),
                        contentScale = ContentScale.Crop)
                }
            }
            Spacer(modifier = Modifier.width(25.dp))
        }
        Text("Каталог описаний", fontSize = 18.sp, color = Color(0xFF939396),
            modifier = Modifier.constrainAs(text22){
                top.linkTo(box11.bottom, 30.dp)
                start.linkTo(parent.start, 25.dp)
            })
        Row(modifier = Modifier.width(370.dp).constrainAs(box22){
            start.linkTo(parent.start,25.dp)
            end.linkTo(parent.end,0.dp)
            top.linkTo(text22.bottom, 13.dp)
        }){
            Button({}, shape = RoundedCornerShape(10.dp), colors = ButtonDefaults.buttonColors(
                containerColor = Color(0xFF1A6FEE)),modifier = Modifier.height(50.dp)) {
                Text("Все",
                    color = Color.White,
                    fontSize = 16.sp,)
            }
            Button({}, shape = RoundedCornerShape(10.dp), colors = ButtonDefaults.buttonColors(
                containerColor = Color(0xFFF5F5F9)),modifier = Modifier.padding(horizontal = 10.dp).height(50.dp)) {
                Text("Женщинам",
                    color = Color(0xFF7E7E9A),
                    fontSize = 14 .sp,)
            }
            Button({}, shape = RoundedCornerShape(10.dp), colors = ButtonDefaults.buttonColors(
                containerColor = Color(0xFFF5F5F9)),modifier = Modifier.height(50.dp)) {
                Text("Мужчинам",
                    color = Color(0xFF7E7E9A),
                    fontSize = 14.sp,)
            }}
        Column(
            modifier = Modifier
                .constrainAs(box33) {
                    top.linkTo(box22.bottom, 30.dp)
                    start.linkTo(parent.start, 25.dp)
                    end.linkTo(parent.end, 25.dp)
                    bottom.linkTo(parent.bottom)
                    width = Dimension.fillToConstraints
                    height = Dimension.fillToConstraints
                }
                .verticalScroll(rememberScrollState())
        ) {
            Spacer(modifier = Modifier.width(25.dp))
            Card(modifier = Modifier.size(370.dp,200.dp)
            ) {
                Column() {
                    Text(
                        "Рубашка Воскресенье для машинного вязания",
                        color = Color.Black,
                        fontSize = 18.sp,
                        modifier = Modifier.padding(15.dp, top = 30.dp, end = 15.dp)
                    )
                    Row(modifier = Modifier.height(200.dp).padding(top = 30.dp)) {
                        Column() {
                            Text(
                                "Мужская одежда",
                                color = Color(0xFF939396),
                                fontSize = 14.sp,
                                modifier = Modifier.padding(15.dp)
                            )
                            Text("300 ₽", fontSize = 16.sp, color = Color.Black,modifier = Modifier.padding(start = 15.dp))
                        }

                        val added = remember { mutableStateOf(false) }
                        val shape = FloatingActionButtonDefaults.extendedFabShape

                        ExtendedFloatingActionButton(
                            onClick = { added.value = !added.value },
                            modifier = Modifier
                                .height(65.dp)
                                .padding(top = 15.dp, start = 65.dp)
                                .border(
                                    width = if (added.value) 1.dp else 0.dp,
                                    color = if (added.value) Color(0xFF1A6FEE) else Color(0xFF1A6FEE),
                                    shape = shape
                                ),
                            shape = shape,
                            containerColor = if (added.value) Color.White else Color(0xFF2074F2),
                            contentColor = if (added.value) Color(0xFF1A6FEE) else Color.White
                        ) {
                            Text(if (added.value) "Удалить" else "Добавить")
                        }
                    }
                }
            }
            Spacer(modifier = Modifier.height(25.dp))
            Card(modifier = Modifier.size(370.dp,200.dp)
            ) {
                Column() {
                    Text(
                        "Рубашка Воскресенье для машинного вязания",
                        color = Color.Black,
                        fontSize = 18.sp,
                        modifier = Modifier.padding(15.dp, top = 30.dp, end = 15.dp)
                    )
                    Row(modifier = Modifier.height(200.dp).padding(top = 30.dp)) {
                        Column() {
                            Text(
                                "Мужская одежда",
                                color = Color(0xFF939396),
                                fontSize = 14.sp,
                                modifier = Modifier.padding(15.dp)
                            )
                            Text("300 ₽", fontSize = 16.sp, color = Color.Black,modifier = Modifier.padding(start = 15.dp))
                        }
                        val added = remember { mutableStateOf(false) }
                        val shape = FloatingActionButtonDefaults.extendedFabShape

                        ExtendedFloatingActionButton(
                            onClick = { added.value = !added.value },
                            modifier = Modifier
                                .height(65.dp)
                                .padding(top = 15.dp, start = 65.dp)
                                .border(
                                    width = if (added.value) 1.dp else 0.dp,
                                    color = if (added.value) Color(0xFF1A6FEE) else Color(0xFF1A6FEE),
                                    shape = shape
                                ),
                            shape = shape,
                            containerColor = if (added.value) Color.White else Color(0xFF2074F2),
                            contentColor = if (added.value) Color(0xFF1A6FEE) else Color.White
                        ) {
                            Text(if (added.value) "Удалить" else "Добавить")
                        }
                    }
                }
            }
        }
    }
}





@Preview(showBackground = true)
@Composable
fun MyPreviewCards() {
    ConstraintLayoutCards()
}
@Preview(showBackground = true)
@Composable
fun MyPreviewWelcome() {
    ConstraintLayoutWelcome()
}