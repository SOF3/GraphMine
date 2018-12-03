package io.github.sof3.graphmine.util

/*
 * GraphMine
 * Copyright (C) 2018 SOFe
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Affero General Public License as published
 * by the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Affero General Public License for more details.
 *
 * You should have received a copy of the GNU Affero General Public License
 * along with this program.  If not, see <https://www.gnu.org/licenses/>.
 */

/**
 * Returns an array containing the results of applying the given [transform] function to each element in the
 * original array
 */
inline fun ByteArray.mapByteArray(transform: (Byte) -> Byte) = ByteArray(size) { transform(this[it]) }

/**
 * Returns an array containing the results of applying the given [transform] function to each element in the
 * original array
 */
inline fun ByteArray.mapCharArray(transform: (Byte) -> Char) = CharArray(size) { transform(this[it]) }

/**
 * Returns an array containing the results of applying the given [transform] function to each element in the
 * original array
 */
inline fun ByteArray.mapShortArray(transform: (Byte) -> Short) = ShortArray(size) { transform(this[it]) }

/**
 * Returns an array containing the results of applying the given [transform] function to each element in the
 * original array
 */
inline fun ByteArray.mapIntArray(transform: (Byte) -> Int) = IntArray(size) { transform(this[it]) }

/**
 * Returns an array containing the results of applying the given [transform] function to each element in the
 * original array
 */
inline fun ByteArray.mapLongArray(transform: (Byte) -> Long) = LongArray(size) { transform(this[it]) }

/**
 * Returns an array containing the results of applying the given [transform] function to each element in the
 * original array
 */
inline fun ByteArray.mapFloatArray(transform: (Byte) -> Float) = FloatArray(size) { transform(this[it]) }

/**
 * Returns an array containing the results of applying the given [transform] function to each element in the
 * original array
 */
inline fun ByteArray.mapDoubleArray(transform: (Byte) -> Double) = DoubleArray(size) { transform(this[it]) }

/**
 * Returns an array containing the results of applying the given [transform] function to each element in the
 * original array
 */
inline fun ByteArray.mapBooleanArray(transform: (Byte) -> Boolean) = BooleanArray(size) { transform(this[it]) }

/**
 * Returns an array containing the results of applying the given [transform] function to each element in the
 * original array
 */
inline fun CharArray.mapByteArray(transform: (Char) -> Byte) = ByteArray(size) { transform(this[it]) }

/**
 * Returns an array containing the results of applying the given [transform] function to each element in the
 * original array
 */
inline fun CharArray.mapCharArray(transform: (Char) -> Char) = CharArray(size) { transform(this[it]) }

/**
 * Returns an array containing the results of applying the given [transform] function to each element in the
 * original array
 */
inline fun CharArray.mapShortArray(transform: (Char) -> Short) = ShortArray(size) { transform(this[it]) }

/**
 * Returns an array containing the results of applying the given [transform] function to each element in the
 * original array
 */
inline fun CharArray.mapIntArray(transform: (Char) -> Int) = IntArray(size) { transform(this[it]) }

/**
 * Returns an array containing the results of applying the given [transform] function to each element in the
 * original array
 */
inline fun CharArray.mapLongArray(transform: (Char) -> Long) = LongArray(size) { transform(this[it]) }

/**
 * Returns an array containing the results of applying the given [transform] function to each element in the
 * original array
 */
inline fun CharArray.mapFloatArray(transform: (Char) -> Float) = FloatArray(size) { transform(this[it]) }

/**
 * Returns an array containing the results of applying the given [transform] function to each element in the
 * original array
 */
inline fun CharArray.mapDoubleArray(transform: (Char) -> Double) = DoubleArray(size) { transform(this[it]) }

/**
 * Returns an array containing the results of applying the given [transform] function to each element in the
 * original array
 */
inline fun CharArray.mapBooleanArray(transform: (Char) -> Boolean) = BooleanArray(size) { transform(this[it]) }

/**
 * Returns an array containing the results of applying the given [transform] function to each element in the
 * original array
 */
inline fun ShortArray.mapByteArray(transform: (Short) -> Byte) = ByteArray(size) { transform(this[it]) }

/**
 * Returns an array containing the results of applying the given [transform] function to each element in the
 * original array
 */
inline fun ShortArray.mapCharArray(transform: (Short) -> Char) = CharArray(size) { transform(this[it]) }

/**
 * Returns an array containing the results of applying the given [transform] function to each element in the
 * original array
 */
inline fun ShortArray.mapShortArray(transform: (Short) -> Short) = ShortArray(size) { transform(this[it]) }

/**
 * Returns an array containing the results of applying the given [transform] function to each element in the
 * original array
 */
inline fun ShortArray.mapIntArray(transform: (Short) -> Int) = IntArray(size) { transform(this[it]) }

/**
 * Returns an array containing the results of applying the given [transform] function to each element in the
 * original array
 */
inline fun ShortArray.mapLongArray(transform: (Short) -> Long) = LongArray(size) { transform(this[it]) }

/**
 * Returns an array containing the results of applying the given [transform] function to each element in the
 * original array
 */
inline fun ShortArray.mapFloatArray(transform: (Short) -> Float) = FloatArray(size) { transform(this[it]) }

/**
 * Returns an array containing the results of applying the given [transform] function to each element in the
 * original array
 */
inline fun ShortArray.mapDoubleArray(transform: (Short) -> Double) = DoubleArray(size) { transform(this[it]) }

/**
 * Returns an array containing the results of applying the given [transform] function to each element in the
 * original array
 */
inline fun ShortArray.mapBooleanArray(transform: (Short) -> Boolean) = BooleanArray(size) { transform(this[it]) }

/**
 * Returns an array containing the results of applying the given [transform] function to each element in the
 * original array
 */
inline fun IntArray.mapByteArray(transform: (Int) -> Byte) = ByteArray(size) { transform(this[it]) }

/**
 * Returns an array containing the results of applying the given [transform] function to each element in the
 * original array
 */
inline fun IntArray.mapCharArray(transform: (Int) -> Char) = CharArray(size) { transform(this[it]) }

/**
 * Returns an array containing the results of applying the given [transform] function to each element in the
 * original array
 */
inline fun IntArray.mapShortArray(transform: (Int) -> Short) = ShortArray(size) { transform(this[it]) }

/**
 * Returns an array containing the results of applying the given [transform] function to each element in the
 * original array
 */
inline fun IntArray.mapIntArray(transform: (Int) -> Int) = IntArray(size) { transform(this[it]) }

/**
 * Returns an array containing the results of applying the given [transform] function to each element in the
 * original array
 */
inline fun IntArray.mapLongArray(transform: (Int) -> Long) = LongArray(size) { transform(this[it]) }

/**
 * Returns an array containing the results of applying the given [transform] function to each element in the
 * original array
 */
inline fun IntArray.mapFloatArray(transform: (Int) -> Float) = FloatArray(size) { transform(this[it]) }

/**
 * Returns an array containing the results of applying the given [transform] function to each element in the
 * original array
 */
inline fun IntArray.mapDoubleArray(transform: (Int) -> Double) = DoubleArray(size) { transform(this[it]) }

/**
 * Returns an array containing the results of applying the given [transform] function to each element in the
 * original array
 */
inline fun IntArray.mapBooleanArray(transform: (Int) -> Boolean) = BooleanArray(size) { transform(this[it]) }

/**
 * Returns an array containing the results of applying the given [transform] function to each element in the
 * original array
 */
inline fun LongArray.mapByteArray(transform: (Long) -> Byte) = ByteArray(size) { transform(this[it]) }

/**
 * Returns an array containing the results of applying the given [transform] function to each element in the
 * original array
 */
inline fun LongArray.mapCharArray(transform: (Long) -> Char) = CharArray(size) { transform(this[it]) }

/**
 * Returns an array containing the results of applying the given [transform] function to each element in the
 * original array
 */
inline fun LongArray.mapShortArray(transform: (Long) -> Short) = ShortArray(size) { transform(this[it]) }

/**
 * Returns an array containing the results of applying the given [transform] function to each element in the
 * original array
 */
inline fun LongArray.mapIntArray(transform: (Long) -> Int) = IntArray(size) { transform(this[it]) }

/**
 * Returns an array containing the results of applying the given [transform] function to each element in the
 * original array
 */
inline fun LongArray.mapLongArray(transform: (Long) -> Long) = LongArray(size) { transform(this[it]) }

/**
 * Returns an array containing the results of applying the given [transform] function to each element in the
 * original array
 */
inline fun LongArray.mapFloatArray(transform: (Long) -> Float) = FloatArray(size) { transform(this[it]) }

/**
 * Returns an array containing the results of applying the given [transform] function to each element in the
 * original array
 */
inline fun LongArray.mapDoubleArray(transform: (Long) -> Double) = DoubleArray(size) { transform(this[it]) }

/**
 * Returns an array containing the results of applying the given [transform] function to each element in the
 * original array
 */
inline fun LongArray.mapBooleanArray(transform: (Long) -> Boolean) = BooleanArray(size) { transform(this[it]) }

/**
 * Returns an array containing the results of applying the given [transform] function to each element in the
 * original array
 */
inline fun FloatArray.mapByteArray(transform: (Float) -> Byte) = ByteArray(size) { transform(this[it]) }

/**
 * Returns an array containing the results of applying the given [transform] function to each element in the
 * original array
 */
inline fun FloatArray.mapCharArray(transform: (Float) -> Char) = CharArray(size) { transform(this[it]) }

/**
 * Returns an array containing the results of applying the given [transform] function to each element in the
 * original array
 */
inline fun FloatArray.mapShortArray(transform: (Float) -> Short) = ShortArray(size) { transform(this[it]) }

/**
 * Returns an array containing the results of applying the given [transform] function to each element in the
 * original array
 */
inline fun FloatArray.mapIntArray(transform: (Float) -> Int) = IntArray(size) { transform(this[it]) }

/**
 * Returns an array containing the results of applying the given [transform] function to each element in the
 * original array
 */
inline fun FloatArray.mapLongArray(transform: (Float) -> Long) = LongArray(size) { transform(this[it]) }

/**
 * Returns an array containing the results of applying the given [transform] function to each element in the
 * original array
 */
inline fun FloatArray.mapFloatArray(transform: (Float) -> Float) = FloatArray(size) { transform(this[it]) }

/**
 * Returns an array containing the results of applying the given [transform] function to each element in the
 * original array
 */
inline fun FloatArray.mapDoubleArray(transform: (Float) -> Double) = DoubleArray(size) { transform(this[it]) }

/**
 * Returns an array containing the results of applying the given [transform] function to each element in the
 * original array
 */
inline fun FloatArray.mapBooleanArray(transform: (Float) -> Boolean) = BooleanArray(size) { transform(this[it]) }

/**
 * Returns an array containing the results of applying the given [transform] function to each element in the
 * original array
 */
inline fun DoubleArray.mapByteArray(transform: (Double) -> Byte) = ByteArray(size) { transform(this[it]) }

/**
 * Returns an array containing the results of applying the given [transform] function to each element in the
 * original array
 */
inline fun DoubleArray.mapCharArray(transform: (Double) -> Char) = CharArray(size) { transform(this[it]) }

/**
 * Returns an array containing the results of applying the given [transform] function to each element in the
 * original array
 */
inline fun DoubleArray.mapShortArray(transform: (Double) -> Short) = ShortArray(size) { transform(this[it]) }

/**
 * Returns an array containing the results of applying the given [transform] function to each element in the
 * original array
 */
inline fun DoubleArray.mapIntArray(transform: (Double) -> Int) = IntArray(size) { transform(this[it]) }

/**
 * Returns an array containing the results of applying the given [transform] function to each element in the
 * original array
 */
inline fun DoubleArray.mapLongArray(transform: (Double) -> Long) = LongArray(size) { transform(this[it]) }

/**
 * Returns an array containing the results of applying the given [transform] function to each element in the
 * original array
 */
inline fun DoubleArray.mapFloatArray(transform: (Double) -> Float) = FloatArray(size) { transform(this[it]) }

/**
 * Returns an array containing the results of applying the given [transform] function to each element in the
 * original array
 */
inline fun DoubleArray.mapDoubleArray(transform: (Double) -> Double) = DoubleArray(size) { transform(this[it]) }

/**
 * Returns an array containing the results of applying the given [transform] function to each element in the
 * original array
 */
inline fun DoubleArray.mapBooleanArray(transform: (Double) -> Boolean) = BooleanArray(size) { transform(this[it]) }

/**
 * Returns an array containing the results of applying the given [transform] function to each element in the
 * original array
 */
inline fun BooleanArray.mapByteArray(transform: (Boolean) -> Byte) = ByteArray(size) { transform(this[it]) }

/**
 * Returns an array containing the results of applying the given [transform] function to each element in the
 * original array
 */
inline fun BooleanArray.mapCharArray(transform: (Boolean) -> Char) = CharArray(size) { transform(this[it]) }

/**
 * Returns an array containing the results of applying the given [transform] function to each element in the
 * original array
 */
inline fun BooleanArray.mapShortArray(transform: (Boolean) -> Short) = ShortArray(size) { transform(this[it]) }

/**
 * Returns an array containing the results of applying the given [transform] function to each element in the
 * original array
 */
inline fun BooleanArray.mapIntArray(transform: (Boolean) -> Int) = IntArray(size) { transform(this[it]) }

/**
 * Returns an array containing the results of applying the given [transform] function to each element in the
 * original array
 */
inline fun BooleanArray.mapLongArray(transform: (Boolean) -> Long) = LongArray(size) { transform(this[it]) }

/**
 * Returns an array containing the results of applying the given [transform] function to each element in the
 * original array
 */
inline fun BooleanArray.mapFloatArray(transform: (Boolean) -> Float) = FloatArray(size) { transform(this[it]) }

/**
 * Returns an array containing the results of applying the given [transform] function to each element in the
 * original array
 */
inline fun BooleanArray.mapDoubleArray(transform: (Boolean) -> Double) = DoubleArray(size) { transform(this[it]) }

/**
 * Returns an array containing the results of applying the given [transform] function to each element in the
 * original array
 */
inline fun BooleanArray.mapBooleanArray(transform: (Boolean) -> Boolean) = BooleanArray(size) { transform(this[it]) }


/**
 * Returns an array containing the results of applying the given [transform] function to each element in the
 * original array
 */
inline fun <reified R> ByteArray.mapArray(transform: (Byte) -> R) = Array(size) { transform(this[it]) }

/**
 * Returns an array containing the results of applying the given [transform] function to each element in the
 * original array
 */
inline fun <reified R> CharArray.mapArray(transform: (Char) -> R) = Array(size) { transform(this[it]) }

/**
 * Returns an array containing the results of applying the given [transform] function to each element in the
 * original array
 */
inline fun <reified R> ShortArray.mapArray(transform: (Short) -> R) = Array(size) { transform(this[it]) }

/**
 * Returns an array containing the results of applying the given [transform] function to each element in the
 * original array
 */
inline fun <reified R> IntArray.mapArray(transform: (Int) -> R) = Array(size) { transform(this[it]) }

/**
 * Returns an array containing the results of applying the given [transform] function to each element in the
 * original array
 */
inline fun <reified R> LongArray.mapArray(transform: (Long) -> R) = Array(size) { transform(this[it]) }

/**
 * Returns an array containing the results of applying the given [transform] function to each element in the
 * original array
 */
inline fun <reified R> FloatArray.mapArray(transform: (Float) -> R) = Array(size) { transform(this[it]) }

/**
 * Returns an array containing the results of applying the given [transform] function to each element in the
 * original array
 */
inline fun <reified R> DoubleArray.mapArray(transform: (Double) -> R) = Array(size) { transform(this[it]) }

/**
 * Returns an array containing the results of applying the given [transform] function to each element in the
 * original array
 */
inline fun <reified R> BooleanArray.mapArray(transform: (Boolean) -> R) = Array(size) { transform(this[it]) }


/**
 * Returns an array containing the results of applying the given [transform] function to each element in the
 * original array
 */
inline fun <T> Array<T>.mapArray(transform: (T) -> Byte) = ByteArray(size) { transform(this[it]) }

/**
 * Returns an array containing the results of applying the given [transform] function to each element in the
 * original array
 */
inline fun <T> Array<T>.mapArray(transform: (T) -> Char) = CharArray(size) { transform(this[it]) }

/**
 * Returns an array containing the results of applying the given [transform] function to each element in the
 * original array
 */
inline fun <T> Array<T>.mapArray(transform: (T) -> Short) = ShortArray(size) { transform(this[it]) }

/**
 * Returns an array containing the results of applying the given [transform] function to each element in the
 * original array
 */
inline fun <T> Array<T>.mapArray(transform: (T) -> Int) = IntArray(size) { transform(this[it]) }

/**
 * Returns an array containing the results of applying the given [transform] function to each element in the
 * original array
 */
inline fun <T> Array<T>.mapArray(transform: (T) -> Long) = LongArray(size) { transform(this[it]) }

/**
 * Returns an array containing the results of applying the given [transform] function to each element in the
 * original array
 */
inline fun <T> Array<T>.mapArray(transform: (T) -> Float) = FloatArray(size) { transform(this[it]) }

/**
 * Returns an array containing the results of applying the given [transform] function to each element in the
 * original array
 */
inline fun <T> Array<T>.mapArray(transform: (T) -> Double) = DoubleArray(size) { transform(this[it]) }

/**
 * Returns an array containing the results of applying the given [transform] function to each element in the
 * original array
 */
inline fun <T> Array<T>.mapArray(transform: (T) -> Boolean) = BooleanArray(size) { transform(this[it]) }


/**
 * Returns an array containing the results of applying the given [transform] function to each element in the
 * original array
 */
inline fun <T, reified R> Array<T>.mapToArray(fn: (T) -> R) = Array(size) { fn(this[it]) }
