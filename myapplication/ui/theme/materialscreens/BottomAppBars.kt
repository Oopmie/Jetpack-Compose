package com.example.myapplication.ui.theme.materialscreens

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountCircle
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.ShoppingCart
import androidx.compose.material3.BottomAppBar
import androidx.compose.material3.Icon
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview

@Composable
fun PacktBottomAppBar(){
    BottomAppBar(
        actions = {
            Icon(imageVector = Icons.Default.Home, contentDescription = "Home Screen")
            Icon(imageVector = Icons.Default.ShoppingCart, contentDescription = "Cart Screen")
            Icon(imageVector = Icons.Default.AccountCircle, contentDescription = "Account Screen")
        },
        floatingActionButton = {
            PacktFloatingActionButton()
        }
    )
}

@Preview
@Composable
fun PacktBottomAppBarPreview(){
    PacktBottomAppBar();
}