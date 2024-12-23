package com.example.ucp2.ui.viewmodel

import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.createSavedStateHandle
import androidx.lifecycle.viewmodel.CreationExtras
import androidx.lifecycle.viewmodel.initializer
import androidx.lifecycle.viewmodel.viewModelFactory
import com.example.ucp2.KrsApp
import com.example.ucp2.ui.viewmodel.dosen.HomeDosenViewModel
import com.example.ucp2.ui.viewmodel.dosen.InsertDosenViewModel
import com.example.ucp2.ui.viewmodel.matakuliah.DetailMKViewModel
import com.example.ucp2.ui.viewmodel.matakuliah.HomeMKViewModel
import com.example.ucp2.ui.viewmodel.matakuliah.InsertMKViewModel
import com.example.ucp2.ui.viewmodel.matakuliah.UpdateMKViewModel

object PenyediaViewModel {

    val Factory = viewModelFactory {
        initializer {
            InsertDosenViewModel(
                krsApp().containerApp.repositoryDosen
            )
        }

        initializer {
            HomeDosenViewModel(
                krsApp().containerApp.repositoryDosen
            )
        }

        initializer {
            InsertMKViewModel(
                krsApp().containerApp.repositoryMK,
                krsApp().containerApp.repositoryDosen
            )
        }

        initializer {
            HomeMKViewModel(
                krsApp().containerApp.repositoryMK
            )
        }

        initializer {
            DetailMKViewModel(
                createSavedStateHandle(),
                krsApp().containerApp.repositoryMK
            )
        }

        initializer {
            UpdateMKViewModel(
                createSavedStateHandle(),
                krsApp().containerApp.repositoryMK,
                krsApp().containerApp.repositoryDosen
            )
        }
    }
}

fun CreationExtras.krsApp(): KrsApp =
    (this[ViewModelProvider.AndroidViewModelFactory.APPLICATION_KEY] as KrsApp)