package com.example.mynavigationapplication

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun ThirdScreen(navigationToFirstScreen:()->Unit){
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(text = "This is third screen. Go to first screen", fontSize = 24.sp)
        Button(onClick = {
            navigationToFirstScreen()
        }) {
            Text(text = "Go to first screen")
        }
    }

}

@Preview(showBackground = true)
@Composable
fun ThirdPreview(){
    ThirdScreen({})
}