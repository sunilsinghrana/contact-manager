package com.example.phonemanager.navigation.destinations

import androidx.navigation.NavGraphBuilder
import androidx.compose.runtime.LaunchedEffect
import androidx.navigation.compose.composable
import androidx.navigation.navArgument
import androidx.navigation.NavType
import com.example.phonemanager.ui.home.HomeViewModel
import com.example.phonemanager.utils.Action
import com.example.phonemanager.utils.Constants.CONTACT_ARGUMENT_KEY
import com.example.phonemanager.utils.Constants.CONTACT_SCREEN

fun NavGraphBuilder.contactComposable(
    navigateToListScreen: (Action) -> Unit,
    sharedViewModel: HomeViewModel
) {
    composable(route = CONTACT_SCREEN, arguments = listOf(navArgument(CONTACT_ARGUMENT_KEY) {
        type = NavType.IntType
    })) { navBackStackEntry ->

        val noteId = navBackStackEntry.arguments!!.getInt(CONTACT_ARGUMENT_KEY)

        val selectedNote by sharedViewModel.selectedNote.collectAsState()

        LaunchedEffect(key1 = noteId) {
            sharedViewModel.getSelectedNote(noteId = noteId)
        }

        LaunchedEffect(key1 = selectedNote) {
            if (selectedNote != null || noteId == -1) {
                sharedViewModel.updateNoteFields(selectedNote = selectedNote)
            }
        }

//        NoteScreen(
//            navigateToListScreen = navigateToListScreen,
//            selectedNote = selectedNote,
//            sharedViewModel = sharedViewModel
//        )
    }
}