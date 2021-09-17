package com.example.modelviewer.ui.home

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.modelviewer.R
import com.example.modelviewer.databinding.FragmentHomeBinding
import com.example.modelviewer.utils.viewbinding.viewBinding

class HomeFragment : Fragment(R.layout.fragment_home) {

    private val binding by viewBinding(FragmentHomeBinding::bind)

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        with(binding) {
            modelViewerButton.setOnClickListener { modelViewerButtonClicked() }
            arCoreButton.setOnClickListener { arCoreButtonClicked() }
        }
    }

    private fun modelViewerButtonClicked() {
        findNavController().navigate(HomeFragmentDirections.actionModelViewerFragmentToModelViewerFragment())
    }

    private fun arCoreButtonClicked() {
        val sceneViewerIntent = Intent(Intent.ACTION_VIEW)
        sceneViewerIntent.data =
            Uri.parse("https://arvr.google.com/scene-viewer/1.0?file=https://test-aorist-bucket.s3.amazonaws.com/models/artwork/187.1.glb")
        sceneViewerIntent.setPackage("com.google.android.googlequicksearchbox")
        startActivity(sceneViewerIntent)
    }
}
