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

enum class Navigasi {
    Formulir,
    Data
}

@Composable
fun Navigate(
    navController: NavHostController = rememberNavController()
) {
    Scaffold { innerPadding ->
        NavHost(
            navController = navController,
            startDestination = Navigasi.Formulir.name,
            modifier = Modifier.padding(innerPadding).fillMaxSize()
        ) {
            composable(route = Navigasi.Formulir.name) {
                Formulir(
                    OnSubmitBtnClick = {
                        navController.navigate(Navigasi.Data.name)
                    }
                )
            }

            composable(route = Navigasi.Data.name) {
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
    navController.popBackStack(Navigasi.Formulir.name, inclusive = false)
}