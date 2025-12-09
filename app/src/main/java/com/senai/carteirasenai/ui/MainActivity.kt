package com.senai.carteirasenai

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.senai.carteirasenai.ui.theme.CarteiraSenaiTheme

    class MainActivity : ComponentActivity() {
        override fun onCreate(savedInstanceState: Bundle?) {
            super.onCreate(savedInstanceState)
            enableEdgeToEdge()
            setContent {
                CarteiraSenaiTheme   {
                    Surface(modifier = Modifier.fillMaxSize()) {
                        Box(modifier = Modifier.fillMaxSize()) {
                            Image(
                                painter = painterResource(id = R.drawable.ic_launcher_background
                                ),
                                contentDescription = null,
                                contentScale = ContentScale.Crop,
                                modifier = Modifier.fillMaxSize(),
                                alpha = 0.5F
                            )
                        }
                        Column(
                            modifier = Modifier
                                .fillMaxSize()
                                .padding(16.dp),
                            horizontalAlignment = Alignment.CenterHorizontally
                        ) {
                            Image(
                                painter = painterResource(id = R.drawable.images2),
                                contentDescription = "Logo SENAI",
                                modifier = Modifier
                                    .size(190.dp),
                                contentScale = ContentScale.Fit
                            )
                            Spacer(modifier = Modifier.height(12.dp))
                            Titulo("")
                            Image(
                                painter = painterResource(id =R.drawable.pngtree_round_stamp_icon_in_flat_black_and_white_for_user_profile_photo_image_19576116),
                                contentDescription = "Logo SENAI",
                                modifier = Modifier
                                    .size(160.dp)
                                    .padding(top = 30.dp),
                                contentScale = ContentScale.Fit
                            )
                            Spacer(modifier = Modifier.height(24.dp))
                            Image(
                                painter = painterResource(id = R.drawable.download),
                                contentDescription = "QR Code",
                                modifier = Modifier
                                    .size(280.dp)
                                    .align(Alignment.CenterHorizontally)
                                    .padding(top = 60.dp),

                                contentScale = ContentScale.Fit
                            )
                            Spacer(modifier = Modifier.height(16.dp))
                            Spacer(modifier = Modifier.weight(1f))
                            Row(
                                modifier = Modifier
                                    .fillMaxWidth()
                                    .padding(bottom = 8.dp),
                                horizontalArrangement = Arrangement.SpaceBetween
                            ) {
                                Text("Vila Mariana\n" + "Desenvolvimento de Sistemas")
                                Text("25/02/2004\n" + "18/12/2025")
                            }
                        }
                    }
                }
            }
        }
        @Composable
        fun Titulo(texto: String = "Android", modifier: Modifier = Modifier) {
            Text(
                texto,
                textAlign = TextAlign.Center,
                fontSize = 30.sp,
                fontFamily = FontFamily.Serif,
                fontWeight = FontWeight.Bold,
                modifier = modifier
            )
        }
    }



