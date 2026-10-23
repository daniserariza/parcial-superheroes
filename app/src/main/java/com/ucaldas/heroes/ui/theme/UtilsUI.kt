package com.ucaldas.heroes.ui.theme

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Card
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.unit.dp
import coil.compose.AsyncImage
import coil.request.ImageRequest
import com.ucaldas.heroes.Elemento

@Composable
fun HeroImage(
    imageUrl: String,
    contentDescription: String,
    modifier: Modifier = Modifier
) {
    val context = LocalContext.current

    AsyncImage(
        model = ImageRequest.Builder(context)
            .data(imageUrl)
            .crossfade(true)
            .build(),
        contentDescription = contentDescription,
        modifier = modifier
            .fillMaxWidth()
            .height(220.dp),
        contentScale = ContentScale.Crop
    )
}

@Composable
fun HeroInfo(
    hero: Elemento,
    modifier: Modifier = Modifier
) {
    Column(modifier = modifier.padding(16.dp)) {
        Text(
            text = "ID: ${hero.id}",
            style = MaterialTheme.typography.labelMedium
        )
        Text(
            text = hero.nombre,
            style = MaterialTheme.typography.displayMedium,
            modifier = Modifier.padding(top = 4.dp)
        )
        Text(
            text = hero.descripcion,
            style = MaterialTheme.typography.bodyMedium,
            modifier = Modifier.padding(top = 8.dp)
        )
        Text(
            text = "Superpoderes: ${hero.superPoderes.joinToString()}",
            style = MaterialTheme.typography.bodySmall,
            modifier = Modifier.padding(top = 8.dp)
        )
    }
}

@Composable
fun HeroCard(
    hero: Elemento,
    onClick: (() -> Unit)? = null,
    option: Int = 0,
    modifier: Modifier = Modifier
) {
    Card(
        modifier = modifier
            .fillMaxWidth()
            .then(
                if (onClick != null) {
                    Modifier.clickable { onClick() }
                } else {
                    Modifier
                }
            )
    ) {
        Column {
            HeroImage(
                imageUrl = hero.imagenUrl,
                contentDescription = hero.nombre
            )

            if (option == 0) {
                HeroInfo(hero = hero)
            } else {
                HeroInfoDetail(hero = hero)
            }
        }
    }
}

@Composable
fun HeroInfoDetail(
    hero: Elemento,
    modifier: Modifier = Modifier
) {
    Column(
        modifier = modifier.padding(16.dp),
        verticalArrangement = Arrangement.spacedBy(12.dp)
    ) {
        Text(
            text = "ID: ${hero.id}",
            style = MaterialTheme.typography.labelMedium
        )
        Text(
            text = hero.nombre,
            style = MaterialTheme.typography.headlineMedium
        )
        Text(
            text = hero.descripcion,
            style = MaterialTheme.typography.bodyLarge
        )
        Text(
            text = "Superpoderes:",
            style = MaterialTheme.typography.titleMedium,
            modifier = Modifier.padding(top = 8.dp)
        )
        hero.superPoderes.forEach { poder ->
            Text(
                text = "• $poder",
                style = MaterialTheme.typography.bodyMedium
            )
        }

        Spacer(modifier = Modifier.height(16.dp))
    }
}
