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

inline fun ByteArray.mapByteArray(fn: (Byte) -> Byte) = ByteArray(size) {fn(this[it])}
inline fun ByteArray.mapCharArray(fn: (Byte) -> Char) = CharArray(size) {fn(this[it])}
inline fun ByteArray.mapShortArray(fn: (Byte) -> Short) = ShortArray(size) {fn(this[it])}
inline fun ByteArray.mapIntArray(fn: (Byte) -> Int) = IntArray(size) {fn(this[it])}
inline fun ByteArray.mapLongArray(fn: (Byte) -> Long) = LongArray(size) {fn(this[it])}
inline fun ByteArray.mapFloatArray(fn: (Byte) -> Float) = FloatArray(size) {fn(this[it])}
inline fun ByteArray.mapDoubleArray(fn: (Byte) -> Double) = DoubleArray(size) {fn(this[it])}
inline fun ByteArray.mapBooleanArray(fn: (Byte) -> Boolean) = BooleanArray(size) {fn(this[it])}
inline fun CharArray.mapByteArray(fn: (Char) -> Byte) = ByteArray(size) {fn(this[it])}
inline fun CharArray.mapCharArray(fn: (Char) -> Char) = CharArray(size) {fn(this[it])}
inline fun CharArray.mapShortArray(fn: (Char) -> Short) = ShortArray(size) {fn(this[it])}
inline fun CharArray.mapIntArray(fn: (Char) -> Int) = IntArray(size) {fn(this[it])}
inline fun CharArray.mapLongArray(fn: (Char) -> Long) = LongArray(size) {fn(this[it])}
inline fun CharArray.mapFloatArray(fn: (Char) -> Float) = FloatArray(size) {fn(this[it])}
inline fun CharArray.mapDoubleArray(fn: (Char) -> Double) = DoubleArray(size) {fn(this[it])}
inline fun CharArray.mapBooleanArray(fn: (Char) -> Boolean) = BooleanArray(size) {fn(this[it])}
inline fun ShortArray.mapByteArray(fn: (Short) -> Byte) = ByteArray(size) {fn(this[it])}
inline fun ShortArray.mapCharArray(fn: (Short) -> Char) = CharArray(size) {fn(this[it])}
inline fun ShortArray.mapShortArray(fn: (Short) -> Short) = ShortArray(size) {fn(this[it])}
inline fun ShortArray.mapIntArray(fn: (Short) -> Int) = IntArray(size) {fn(this[it])}
inline fun ShortArray.mapLongArray(fn: (Short) -> Long) = LongArray(size) {fn(this[it])}
inline fun ShortArray.mapFloatArray(fn: (Short) -> Float) = FloatArray(size) {fn(this[it])}
inline fun ShortArray.mapDoubleArray(fn: (Short) -> Double) = DoubleArray(size) {fn(this[it])}
inline fun ShortArray.mapBooleanArray(fn: (Short) -> Boolean) = BooleanArray(size) {fn(this[it])}
inline fun IntArray.mapByteArray(fn: (Int) -> Byte) = ByteArray(size) {fn(this[it])}
inline fun IntArray.mapCharArray(fn: (Int) -> Char) = CharArray(size) {fn(this[it])}
inline fun IntArray.mapShortArray(fn: (Int) -> Short) = ShortArray(size) {fn(this[it])}
inline fun IntArray.mapIntArray(fn: (Int) -> Int) = IntArray(size) {fn(this[it])}
inline fun IntArray.mapLongArray(fn: (Int) -> Long) = LongArray(size) {fn(this[it])}
inline fun IntArray.mapFloatArray(fn: (Int) -> Float) = FloatArray(size) {fn(this[it])}
inline fun IntArray.mapDoubleArray(fn: (Int) -> Double) = DoubleArray(size) {fn(this[it])}
inline fun IntArray.mapBooleanArray(fn: (Int) -> Boolean) = BooleanArray(size) {fn(this[it])}
inline fun LongArray.mapByteArray(fn: (Long) -> Byte) = ByteArray(size) {fn(this[it])}
inline fun LongArray.mapCharArray(fn: (Long) -> Char) = CharArray(size) {fn(this[it])}
inline fun LongArray.mapShortArray(fn: (Long) -> Short) = ShortArray(size) {fn(this[it])}
inline fun LongArray.mapIntArray(fn: (Long) -> Int) = IntArray(size) {fn(this[it])}
inline fun LongArray.mapLongArray(fn: (Long) -> Long) = LongArray(size) {fn(this[it])}
inline fun LongArray.mapFloatArray(fn: (Long) -> Float) = FloatArray(size) {fn(this[it])}
inline fun LongArray.mapDoubleArray(fn: (Long) -> Double) = DoubleArray(size) {fn(this[it])}
inline fun LongArray.mapBooleanArray(fn: (Long) -> Boolean) = BooleanArray(size) {fn(this[it])}
inline fun FloatArray.mapByteArray(fn: (Float) -> Byte) = ByteArray(size) {fn(this[it])}
inline fun FloatArray.mapCharArray(fn: (Float) -> Char) = CharArray(size) {fn(this[it])}
inline fun FloatArray.mapShortArray(fn: (Float) -> Short) = ShortArray(size) {fn(this[it])}
inline fun FloatArray.mapIntArray(fn: (Float) -> Int) = IntArray(size) {fn(this[it])}
inline fun FloatArray.mapLongArray(fn: (Float) -> Long) = LongArray(size) {fn(this[it])}
inline fun FloatArray.mapFloatArray(fn: (Float) -> Float) = FloatArray(size) {fn(this[it])}
inline fun FloatArray.mapDoubleArray(fn: (Float) -> Double) = DoubleArray(size) {fn(this[it])}
inline fun FloatArray.mapBooleanArray(fn: (Float) -> Boolean) = BooleanArray(size) {fn(this[it])}
inline fun DoubleArray.mapByteArray(fn: (Double) -> Byte) = ByteArray(size) {fn(this[it])}
inline fun DoubleArray.mapCharArray(fn: (Double) -> Char) = CharArray(size) {fn(this[it])}
inline fun DoubleArray.mapShortArray(fn: (Double) -> Short) = ShortArray(size) {fn(this[it])}
inline fun DoubleArray.mapIntArray(fn: (Double) -> Int) = IntArray(size) {fn(this[it])}
inline fun DoubleArray.mapLongArray(fn: (Double) -> Long) = LongArray(size) {fn(this[it])}
inline fun DoubleArray.mapFloatArray(fn: (Double) -> Float) = FloatArray(size) {fn(this[it])}
inline fun DoubleArray.mapDoubleArray(fn: (Double) -> Double) = DoubleArray(size) {fn(this[it])}
inline fun DoubleArray.mapBooleanArray(fn: (Double) -> Boolean) = BooleanArray(size) {fn(this[it])}
inline fun BooleanArray.mapByteArray(fn: (Boolean) -> Byte) = ByteArray(size) {fn(this[it])}
inline fun BooleanArray.mapCharArray(fn: (Boolean) -> Char) = CharArray(size) {fn(this[it])}
inline fun BooleanArray.mapShortArray(fn: (Boolean) -> Short) = ShortArray(size) {fn(this[it])}
inline fun BooleanArray.mapIntArray(fn: (Boolean) -> Int) = IntArray(size) {fn(this[it])}
inline fun BooleanArray.mapLongArray(fn: (Boolean) -> Long) = LongArray(size) {fn(this[it])}
inline fun BooleanArray.mapFloatArray(fn: (Boolean) -> Float) = FloatArray(size) {fn(this[it])}
inline fun BooleanArray.mapDoubleArray(fn: (Boolean) -> Double) = DoubleArray(size) {fn(this[it])}
inline fun BooleanArray.mapBooleanArray(fn: (Boolean) -> Boolean) = BooleanArray(size) {fn(this[it])}

inline fun <reified R> ByteArray.mapArray(fn: (Byte) -> R) = Array(size) {fn(this[it])}
inline fun <reified R> CharArray.mapArray(fn: (Char) -> R) = Array(size) {fn(this[it])}
inline fun <reified R> ShortArray.mapArray(fn: (Short) -> R) = Array(size) {fn(this[it])}
inline fun <reified R> IntArray.mapArray(fn: (Int) -> R) = Array(size) {fn(this[it])}
inline fun <reified R> LongArray.mapArray(fn: (Long) -> R) = Array(size) {fn(this[it])}
inline fun <reified R> FloatArray.mapArray(fn: (Float) -> R) = Array(size) {fn(this[it])}
inline fun <reified R> DoubleArray.mapArray(fn: (Double) -> R) = Array(size) {fn(this[it])}
inline fun <reified R> BooleanArray.mapArray(fn: (Boolean) -> R) = Array(size) {fn(this[it])}

inline fun <T> Array<T>.mapByteArray(fn: (T) -> Byte) = ByteArray(size) {fn(this[it])}
inline fun <T> Array<T>.mapCharArray(fn: (T) -> Char) = CharArray(size) {fn(this[it])}
inline fun <T> Array<T>.mapShortArray(fn: (T) -> Short) = ShortArray(size) {fn(this[it])}
inline fun <T> Array<T>.mapIntArray(fn: (T) -> Int) = IntArray(size) {fn(this[it])}
inline fun <T> Array<T>.mapLongArray(fn: (T) -> Long) = LongArray(size) {fn(this[it])}
inline fun <T> Array<T>.mapFloatArray(fn: (T) -> Float) = FloatArray(size) {fn(this[it])}
inline fun <T> Array<T>.mapDoubleArray(fn: (T) -> Double) = DoubleArray(size) {fn(this[it])}
inline fun <T> Array<T>.mapBooleanArray(fn: (T) -> Boolean) = BooleanArray(size) {fn(this[it])}

inline fun <T, reified R> Array<T>.mapToArray(fn: (T) -> R) = Array(size) { fn(this[it]) }
