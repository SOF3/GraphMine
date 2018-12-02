package io.github.sof3.graphmine.command

import io.github.sof3.graphmine.client.Client
import io.github.sof3.graphmine.command.args.*
import kotlin.reflect.KClass

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
 * Defines the parameters of a command.
 *
 * Commands that have parameters should create classes extending Overload. The subclass should contain backing
 * properties delegated to one of the [CommandArg] factory methods like [string], [integer], etc.
 *
 * If another module wants to implement its own [CommandArg] types, it can create extension functions on [Overload] that
 * constructs the CommandArg, calls the [addArg] function and returns the new CommandArg instance.
 */
abstract class Overload {
	internal val args = mutableListOf<CommandArg<*>>()

	/**
	 * @see StringArg
	 */
	fun string(): CommandArg<String> = addArg(StringArg())

	/**
	 * @see IntegerArg
	 */
	fun integer(): CommandArg<Int> = addArg(IntegerArg())

	/**
	 * @see NumberArg
	 */
	fun number(): CommandArg<Double> = addArg(NumberArg())

	/**
	 * @see ClientArg
	 */
	fun client(): CommandArg<Client> = addArg(ClientArg())

	/**
	 * @see EnumArg
	 */
	inline fun <reified E : Enum<E>> enum() = enum(E::class)

	/**
	 * @see EnumArg
	 */
	fun <E : Enum<E>> enum(enumClass: KClass<E>): CommandArg<E> = addArg(EnumArg(enumClass))

	/**
	 * @see RawTextArg
	 */
	fun rawText(): CommandArg<String> = addArg(RawTextArg())

	/**
	 * CommandArg factory extension functions must call this function before returning the argument
	 */
	fun <T : Any> addArg(arg: CommandArg<T>): CommandArg<T> {
		args += arg
		return arg
	}
}
