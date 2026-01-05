package com.example.myapplication.ui.theme.materialscreens

import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.rounded.AccountCircle
import androidx.compose.material.icons.rounded.ShoppingCart
import androidx.compose.material3.Icon
import androidx.compose.material3.NavigationDrawerItem
import androidx.compose.material3.NavigationRail
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier

@Composable
fun PacktNavigationRail(){
    NavigationRail(modifier = Modifier.fillMaxHeight()) {
        NavigationDrawerItem(selected = false,
            onClick = {},
            icon = {
                Icon(
                    imageVector = Icons.Default.Home,
                    null
                )
            },
            label = {
                Text(text="Home")
            }
        )
        NavigationDrawerItem(selected = false,
            onClick = {},
            icon = {
                Icon(
                    imageVector = Icons.Rounded.ShoppingCart,
                    null
                )
            },
            label = {
                Text(text="Cart")
            }
        )
        NavigationDrawerItem(selected = false,
            onClick = {},
            icon = {
                Icon(
                    imageVector = Icons.Rounded.AccountCircle,
                    null
                )
            },
            label = {
                Text(text="Account")
            }
        )
    }
}