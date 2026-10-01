package com.example.actbasiccomposable_0077

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.actbasiccomposable_0077.ui.theme.ActBasicComposable_0077Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ActBasicComposable_0077Theme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    // Panggil composable layout utama dengan padding dari Scaffold
                    TataletakBoxColumnRow(
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
}