package com.ucaldas.heroes

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Button
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import com.ucaldas.heroes.ui.theme.HeroCard

@Composable
fun AppNavigation() {
    val navController = rememberNavController()

    NavHost(
        navController = navController,
        startDestination = Utils.Rutas.LISTA
    ) {
        composable(Utils.Rutas.LISTA) {
            ListaSuperHeroes(
                superheroes = obtenerSuperheroes(),
                villanos = obtenerVillanos(),
                onVerDetalle = { id ->
                    navController.navigate(Utils.Rutas.detalle(id))
                }
            )
        }

        composable(
            route = Utils.Rutas.DETALLE,
            arguments = listOf(navArgument("id") { type = NavType.IntType })
        ) { backStackEntry ->
            val id = backStackEntry.arguments?.getInt("id") ?: return@composable
            val hero = (obtenerSuperheroes() + obtenerVillanos()).firstOrNull { it.id == id } ?: return@composable

            DetalleSuperHeroe(
                hero = hero,
                onVolver = { navController.popBackStack() }
            )
        }
    }
}

@Composable
fun ListaSuperHeroes(
    superheroes: List<Elemento>,
    villanos: List<Elemento>,
    onVerDetalle: (Int) -> Unit
) {
    var categoriaSeleccionada by remember { mutableStateOf(0) }

    val listaFiltrada = when (categoriaSeleccionada) {
        0 -> superheroes
        1 -> villanos
        else -> superheroes + villanos
    }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .statusBarsPadding()
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 8.dp, vertical = 12.dp),
            horizontalArrangement = Arrangement.SpaceEvenly
        ) {
            if (categoriaSeleccionada == 0) {
                Button(onClick = { categoriaSeleccionada = 0 }) {
                    Text("Superhéroes")
                }
            } else {
                OutlinedButton(onClick = { categoriaSeleccionada = 0 }) {
                    Text("Superhéroes")
                }
            }

            if (categoriaSeleccionada == 1) {
                Button(onClick = { categoriaSeleccionada = 1 }) {
                    Text("Villanos")
                }
            } else {
                OutlinedButton(onClick = { categoriaSeleccionada = 1 }) {
                    Text("Villanos")
                }
            }

            if (categoriaSeleccionada == 2) {
                Button(onClick = { categoriaSeleccionada = 2 }) {
                    Text("Todos")
                }
            } else {
                OutlinedButton(onClick = { categoriaSeleccionada = 2 }) {
                    Text("Todos")
                }
            }
        }

        LazyColumn(
            modifier = Modifier.fillMaxSize(),
            contentPadding = PaddingValues(16.dp),
            verticalArrangement = Arrangement.spacedBy(8.dp)
        ) {
            items(listaFiltrada, key = { it.id }) { heroe ->
                HeroCard(
                    hero = heroe,
                    onClick = { onVerDetalle(heroe.id) }
                )
            }
        }
    }
}

@Composable
fun DetalleSuperHeroe(
    hero: Elemento,
    onVolver: () -> Unit
) {
    LazyColumn(
        modifier = Modifier
            .fillMaxSize()
            .statusBarsPadding(),
        contentPadding = PaddingValues(16.dp),
        verticalArrangement = Arrangement.spacedBy(12.dp)
    ) {
        item {
            HeroCard(hero = hero, option = 1)
        }
        item {
            Button(
                onClick = onVolver,
                modifier = Modifier.fillMaxWidth()
            ) {
                Text("Volver a la lista")
            }
        }
    }
}