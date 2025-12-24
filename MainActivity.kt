package com.example.myapplication

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.RadioButton
import androidx.compose.material3.RadioButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            MyProgram2()
        }
    }
}

@Composable
fun MyProgram1() {
    val gradientBrush = Brush.linearGradient(
        0.0f to Color(0xFF74C8E4),
        0.5f to Color(0xFF3740F5),
        1.0f to Color(0xFF74C8E4),
        start = Offset( x = Float.POSITIVE_INFINITY, y = 0f),
        end = Offset(x = 0f, y = Float.POSITIVE_INFINITY)
    )

    Box(
        contentAlignment = Alignment.Center,
        modifier = Modifier
            .fillMaxSize()
            .background(gradientBrush)
    )
    {
        Text(text = "Matule", style = androidx.compose.ui.text.TextStyle(fontSize = 40.sp), color = Color.White)
    }
}

@Composable
fun MyProgram2(){
    Column(verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier
            .fillMaxSize()){
            Text(textAlign = TextAlign.Center,
                modifier = Modifier.fillMaxWidth().height(100.dp), text = "Вход", fontSize = 30.sp, fontWeight = FontWeight.Bold)
        Row(modifier = Modifier.padding(35.dp)) {
            RadioButton(
                selected = true,
                onClick = {true},
                colors = RadioButtonDefaults.colors(selectedColor = Color(0xFF1A6FEE))
            )
            RadioButton(
                selected = false,
                onClick = {true},
                colors = RadioButtonDefaults.colors(unselectedColor = Color(0xFF1A6FEE))
            )
            RadioButton(
                selected = false,
                onClick = {true},
                colors = RadioButtonDefaults.colors(unselectedColor = Color(0xFF1A6FEE))
            )
            RadioButton(
                selected = false,
                onClick = {true},
                colors = RadioButtonDefaults.colors(unselectedColor = Color(0xFF1A6FEE))
            )
        }
        Column(horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier) {
            Row(verticalAlignment = Alignment.CenterVertically,
                modifier = Modifier) {
                Button(modifier = Modifier.padding(10.dp).height(90.dp).width(90.dp),
                    onClick = {},
                    shape = RoundedCornerShape(50.dp),
                    colors = ButtonDefaults.buttonColors(contentColor = Color.Black,
                        containerColor = Color(0xFFF5F5F9)),
                ){
                    Text("1",fontSize = 30.sp)
                }
                Button(modifier = Modifier.padding(10.dp).height(90.dp).width(90.dp),
                    onClick = {},
                    shape = RoundedCornerShape(50.dp),
                    colors = ButtonDefaults.buttonColors(contentColor = Color.Black,
                        containerColor = Color(0xFFF5F5F9)),
                ){
                    Text("2",fontSize = 30.sp)
                }
                Button(modifier = Modifier.padding(10.dp).height(90.dp).width(90.dp),
                    onClick = {},
                    shape = RoundedCornerShape(50.dp),
                    colors = ButtonDefaults.buttonColors(contentColor = Color.Black,
                        containerColor = Color(0xFFF5F5F9)),
                ){
                    Text("3",fontSize = 30.sp)
                }
            }

            Row(verticalAlignment = Alignment.CenterVertically,
                modifier = Modifier) {
                Button(modifier = Modifier.padding(10.dp).height(90.dp).width(90.dp),
                    onClick = {},
                    shape = RoundedCornerShape(50.dp),
                    colors = ButtonDefaults.buttonColors(contentColor = Color.Black,
                        containerColor = Color(0xFFF5F5F9)),
                ){
                    Text("4",fontSize = 30.sp)
                }
                Button(modifier = Modifier.padding(10.dp).height(90.dp).width(90.dp),
                    onClick = {},
                    shape = RoundedCornerShape(50.dp),
                    colors = ButtonDefaults.buttonColors(contentColor = Color.Black,
                        containerColor = Color(0xFFF5F5F9)),
                ){
                    Text("5",fontSize = 30.sp)
                }
                Button(modifier = Modifier.padding(10.dp).height(90.dp).width(90.dp),
                    onClick = {},
                    shape = RoundedCornerShape(50.dp),
                    colors = ButtonDefaults.buttonColors(contentColor = Color.Black,
                        containerColor = Color(0xFFF5F5F9)),
                ){
                    Text("6",fontSize = 30.sp)
                }
            }

            Row(verticalAlignment = Alignment.CenterVertically,
                modifier = Modifier) {
                Button(modifier = Modifier.padding(10.dp).height(90.dp).width(90.dp),
                    onClick = {},
                    shape = RoundedCornerShape(50.dp),
                    colors = ButtonDefaults.buttonColors(contentColor = Color.Black,
                        containerColor = Color(0xFFF5F5F9)),
                ){
                    Text("7",fontSize = 30.sp)
                }
                Button(modifier = Modifier.padding(10.dp).height(90.dp).width(90.dp),
                    onClick = {},
                    shape = RoundedCornerShape(50.dp),
                    colors = ButtonDefaults.buttonColors(contentColor = Color.Black,
                        containerColor = Color(0xFFF5F5F9)),
                ){
                    Text("8",fontSize = 30.sp)
                }
                Button(modifier = Modifier.padding(10.dp).height(90.dp).width(90.dp),
                    onClick = {},
                    shape = RoundedCornerShape(50.dp),
                    colors = ButtonDefaults.buttonColors(contentColor = Color.Black,
                        containerColor = Color(0xFFF5F5F9)),
                ){
                    Text("9",fontSize = 30.sp)
                }
            }

            Row(verticalAlignment = Alignment.CenterVertically,
                modifier = Modifier.padding(start = 110.dp)) {
                Button(modifier = Modifier.padding(10.dp).height(90.dp).width(90.dp),
                    onClick = {},
                    shape = RoundedCornerShape(50.dp),
                    colors = ButtonDefaults.buttonColors(contentColor = Color.Black,
                        containerColor = Color(0xFFF5F5F9)),
                ){
                    Text("0",fontSize = 30.sp)
                }
                Image(painter = painterResource(id = R.drawable.delicon), contentDescription = "",
                    modifier = Modifier.padding(35.dp).width(40.dp).height(40.dp))
            }
        }
    }
}



@Preview(showBackground = true)
@Composable
fun MyPreview() {
    MyProgram1()
}
