/*
 * Copyright 2022 Joel Kanyi.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.kanyideveloper.core.model

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class Meal(
    val name: String,
    val imageUrl: String,
    val cookingTime: Int,
    val servingPeople: Int,
    val category: String,
    val cookingDifficulty: String,
    val ingredients: List<String>,
    val cookingDirections: List<String>,
    val isFavorite: Boolean = false,
    val onlineMealId: String? = null,
    val localMealId: Int? = null,
    val mealPlanId: Int? = null
) : Parcelable
