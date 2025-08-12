package com.example.activity2.pages

import androidx.compose.runtime.Composable

@Composable
fun Formulir(onSubmitBtnClick: () -> Unit) {
    var txtNama by remember { mutableStateOf("") }
    var txtEmail by remember { mutableStateOf("") }
    val option = listOf("Laki-laki", "Perempuan")
    var pilihan by remember { mutableStateOf(option[0]) }
}