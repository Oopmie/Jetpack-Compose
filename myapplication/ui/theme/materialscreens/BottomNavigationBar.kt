package com.example.myapplication.ui.theme.materialscreens

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.ImageBitmap
import androidx.compose.ui.res.imageResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun PacktBottomNavigationBar(){
    NavigationBar(
        modifier = Modifier.fillMaxWidth(),
        containerColor = MaterialTheme.colorScheme.background,
        content = {
            NavigationBarItem(
                selected = false,
                onClick = {},
                icon = {
                    Icon(
                        bitmap = ImageBitmap.imageResource(com.example.myapplication.R.drawable.home),
                        contentDescription = "Home Screen",
                        Modifier.size(30.dp)
                    )
                },
                label = {
                    Text(text = "Главная")
                }
            )
            NavigationBarItem(
                selected = false,
                onClick = {},
                icon = {
                    Icon(
                        bitmap = ImageBitmap.imageResource(com.example.myapplication.R.drawable.catalog),
                        contentDescription = "Catalog Screen",
                        Modifier.size(30.dp)
                    )
                },
                label = {
                    Text(text = "Каталог")
                }
            )
            NavigationBarItem(
                selected = false,
                onClick = {},
                icon = {
                    Icon(
                        bitmap = ImageBitmap.imageResource(com.example.myapplication.R.drawable.projects),
                        contentDescription = "Project Screen",
                        Modifier.size(30.dp)
                    )
                },
                label = {
                    Text(text = "Проекты")
                }
            )
            NavigationBarItem(
                selected = false,
                onClick = {},
                icon = {
                    Icon(
                        bitmap = ImageBitmap.imageResource(com.example.myapplication.R.drawable.user),
                        contentDescription = "User Screen",
                        Modifier.size(30.dp)
                    )
                },
                label = {
                    Text(text = "Профиль")
                }
            )
        }
    )
}
@Preview
@Composable
fun PacktBottomNavigationBarPreview(){
    PacktBottomNavigationBar();
}