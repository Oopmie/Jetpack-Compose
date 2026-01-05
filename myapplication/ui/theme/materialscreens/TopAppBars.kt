package com.example.myapplication.ui.theme.materialscreens

import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.LargeTopAppBar
import androidx.compose.material3.MediumTopAppBar
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun PacktSmallTopAppBar(){
    TopAppBar(
        title = {
            Text(text = "Packt publishing")
        }
    )
}
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun PacktMediumTopAppBar(){
    MediumTopAppBar(
        title = {
            Text(text = "Packt publishing")
        }
    )
}
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun PacktLargeTopAppBar(){
    LargeTopAppBar(
        title = {
            Text(text = "Packt publishing")
        }
    )
}
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun PacktCenterAlignedTopAppBar(){
    CenterAlignedTopAppBar(
        title = {
            Text(text = "Packt publishing")
        }
    )
}


@Preview
@Composable
fun CenterAlignedTopAppBarPreview(){
    PacktCenterAlignedTopAppBar();
}
@Preview
@Composable
fun PacktSmallTopAppBarPreview(){
    PacktSmallTopAppBar();
}
@Preview
@Composable
fun PacktMediumTopAppBarPreview(){
    PacktMediumTopAppBar();
}
@Preview
@Composable
fun LargeTopAppBarPreview(){
    PacktLargeTopAppBar();
}