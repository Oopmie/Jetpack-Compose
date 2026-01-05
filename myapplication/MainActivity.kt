package com.example.myapplication

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
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
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ImageBitmap
import androidx.compose.ui.res.imageResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.constraintlayout.compose.ConstraintLayout
import androidx.constraintlayout.compose.Dimension
import com.example.myapplication.ui.theme.materialscreens.PacktBottomNavigationBar

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            ComposableScreen()
        }
    }
}

@Composable
fun Catalog(){
    ConstraintLayout(modifier = Modifier.fillMaxSize()) {
        val (textfield11, box11, box22) = createRefs()
        val message = remember { mutableStateOf("") }
        Row(modifier = Modifier.fillMaxWidth().constrainAs(textfield11) {
            start.linkTo(parent.start, 25.dp)
            top.linkTo(parent.top, 70.dp)
            end.linkTo(parent.end, 25.dp)
            width = Dimension.fillToConstraints
        },horizontalArrangement = Arrangement.spacedBy(20.dp)) {
            OutlinedTextField(
                message.value,
                { message.value = it }, leadingIcon = {
                    Image(
                        bitmap = ImageBitmap.imageResource(R.drawable.icons),
                        contentDescription = "icons",
                        modifier = Modifier.size(20.dp)
                    )
                }, shape = RoundedCornerShape(10.dp), textStyle = TextStyle(fontSize = 16.sp),
                placeholder = {
                    Text(
                        "Искать  описания",
                        color = Color(0xFF939396)
                    )
                },
                colors = OutlinedTextFieldDefaults.colors(
                    unfocusedContainerColor = Color(0xFFF5F5F9),
                    unfocusedBorderColor = Color(0xFFEBEBEB),
                    focusedContainerColor = Color(0xFFF5F5F9),
                    focusedBorderColor = Color(0xFFEBEBEB),
                ),
                modifier = Modifier
                    .height(50.dp)
                    .weight(1f)
            )

            Image(
                bitmap = ImageBitmap.imageResource(R.drawable.usericon),
                contentDescription = "Account Screen", Modifier.size(45.dp)
            )
        }
        Row(modifier = Modifier.width(370.dp).constrainAs(box22){
            start.linkTo(parent.start,25.dp)
            end.linkTo(parent.end)
            top.linkTo(textfield11.bottom, 40.dp)
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
                .constrainAs(box11) {
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
                Column(Modifier.background(color = Color.White)){
                    Text(
                        "Рубашка Воскресенье для машинного вязания",
                        color = Color.Black,
                        fontSize = 18.sp,
                        modifier = Modifier.padding(15.dp, top = 30.dp, end = 15.dp)
                    )
                    Row(modifier = Modifier.height(200.dp).padding(top = 30.dp)) {
                        Column {
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
                Column(Modifier.background(color = Color.White)){
                    Text(
                        "Рубашка Воскресенье для машинного вязания",
                        color = Color.Black,
                        fontSize = 18.sp,
                        modifier = Modifier.padding(15.dp, top = 30.dp, end = 15.dp)
                    )
                    Row(modifier = Modifier.height(200.dp).padding(top = 30.dp)) {
                        Column {
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

                        ExtendedFloatingActionButton (
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
@Composable
fun ComposableScreen() {
    Scaffold(
        bottomBar = {
            PacktBottomNavigationBar()
        }
    ) { innerPadding ->
        Box(modifier = Modifier.padding(innerPadding)) {
            Catalog()
        }
    }
}




@Preview(showBackground = true)
@Composable
fun CatalogPreview() {
    ComposableScreen()
}