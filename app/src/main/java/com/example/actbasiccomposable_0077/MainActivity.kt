package com.example.actbasiccomposable_0077

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.example.actbasiccomposable_0077.ui.theme.ActBasicComposable_0077Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            ActBasicComposable_0077Theme {
                TugasLogin()
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun TataletakPreview() {
    ActBasicComposable_0077Theme {
        TataletakBoxColumnRow()
    }
}