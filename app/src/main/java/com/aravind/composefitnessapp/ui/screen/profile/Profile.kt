package com.aravind.composefitnessapp.ui.screen.profile

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.aravind.composefitnessapp.ui.theme.Black
import com.aravind.composefitnessapp.ui.theme.poppinsFamily

@Composable
fun ProfileScreen() {
    LazyColumn(content = {
        item {
            Column(
                modifier = Modifier
                    .padding(start = 20.dp, end = 20.dp, top = 25.dp, bottom = 25.dp)
                    .fillParentMaxHeight(1f).fillMaxWidth()
            ) {
                Row {
                    Text(
                        "Profile",
                        color = Black,
                        fontSize = 20.sp,
                        fontFamily = poppinsFamily,
                        fontWeight = FontWeight.Bold
                    )
                }
            }
        }
    })
}

@Composable
@Preview
fun ProfileScreenPreview() {
    ProfileScreen()
}