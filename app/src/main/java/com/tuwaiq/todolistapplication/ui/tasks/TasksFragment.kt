package com.tuwaiq.todolistapplication.ui.tasks

import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import com.tuwaiq.todolistapplication.R
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class TasksFragment : Fragment(R.layout.fragment_tasks) {
    private val viewModel: TasksViewModel by viewModels()
}