package com.example.activity2.pages

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Button
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

@Composable
fun ShowData(
    onBackBtnClick: () -> Unit
) {
    val items = listOf(
        Pair("Nama", "Email"),
        Pair("Email", "me@gmail.com"),
        Pair("Gender", "Laki - laki")
    )

    Scaffold { item ->
        Column(
            modifier = Modifier.padding(item).height(500.dp).fillMaxWidth(),
            verticalArrangement = Arrangement.spacedBy(10.dp)
        ) {
            items.forEach { item ->
                Column {
                    Text(text = item.first)
                    Text(text = item.second)
                }
                HorizontalDivider(thickness = 1.dp, color = Color.Green)
            }
            Spacer(Modifier.height(10.dp))
            Button(
                modifier = Modifier.padding(10.dp),
                onClick = onBackBtnClick
            ) { Text("Back") }
        }
    }
}