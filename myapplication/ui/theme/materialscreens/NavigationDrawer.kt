package com.example.myapplication.ui.theme.materialscreens

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.rounded.AccountCircle
import androidx.compose.material.icons.rounded.ShoppingCart
import androidx.compose.material3.Icon
import androidx.compose.material3.NavigationDrawerItem
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier

@Composable
fun PacktNavigationDrawer(onDrawerClicked:()-> Unit={}){
    Column(modifier = Modifier.fillMaxHeight()) {
        Text(text = "Characters")
        NavigationDrawerItem(
            label = {Text(text = "Home")},
            selected = false,
            onClick = {},
            icon = {
                Icon(imageVector = Icons.Default.Home,
                    null
                )
            }
        )
        NavigationDrawerItem(
            label = {Text(text = "Cart")},
            selected = false,
            onClick = {},
            icon = {
                Icon(imageVector = Icons.Rounded.ShoppingCart,
                    null
                )
            }
        )
        NavigationDrawerItem(
            label = {Text(text = "Account")},
            selected = false,
            onClick = {},
            icon = {
                Icon(imageVector = Icons.Rounded.AccountCircle,
                    null
                )
            }
        )
    }
}