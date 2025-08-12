package com.example.activity2

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.activity2.pages.Formulir
import com.example.activity2.pages.ShowData

enum class Form {
    Formulir,
    Data
}

@Composable
fun Perpindahan(
    navController: NavHostController = rememberNavController()
) {
    Scaffold { innerPadding ->
        NavHost(
            navController = navController,
            startDestination = Form.Formulir.name,
            modifier = Modifier.padding(innerPadding).fillMaxSize()
        ) {
            composable(route = Form.Formulir.name) {
                Formulir(
                    onSubmitBtnClick = {
                        navController.navigate(Form.Data.name)
                    }
                )
            }

            composable(route = Form.Data.name) {
                ShowData(
                    onBackBtnClick = {
                        backToForm(navController)
                    }
                )
            }
        }
    }
}

private fun backToForm(
    navController: NavHostController
) {
    navController.popBackStack(Form.Formulir.name, inclusive = false)
}