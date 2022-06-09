package com.example.marvelapp.presentation.characters

import android.view.LayoutInflater
import android.view.ViewGroup
import android.view.ViewParent
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.marvelapp.R
import com.example.marvelapp.databinding.ItemCharacterBinding
import com.trainee.core.domain.model.Character

class CharactersViewHolder(
    itemCharacterBinding: ItemCharacterBinding
): RecyclerView.ViewHolder(itemCharacterBinding.root) {
    private val textName = itemCharacterBinding.textName
    private val imageCharacter = itemCharacterBinding.imageCharacter

    fun bind(character: Character) {
        textName.text = character.name
        Glide.with(itemView)
            .load(character.imageUrl)
            .fallback(R.drawable.ic_img_loading_error)
            .into(imageCharacter)
    }

    companion object {
        fun create(parent: ViewGroup): CharactersViewHolder {
            val inflater = LayoutInflater.from(parent.context)
            val itemBiding = ItemCharacterBinding.inflate(inflater, parent, false)
            return CharactersViewHolder(itemBiding)
        }
    }

}