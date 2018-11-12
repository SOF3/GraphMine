package io.github.sof3.graphmine

import io.github.sof3.graphmine.config.CoreConfig
import io.github.sof3.graphmine.feature.FeatureGraph
import io.github.sof3.graphmine.i18n.core.CoreLang
import io.github.sof3.graphmine.scope.Scope
import org.apache.logging.log4j.Logger

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
 * The Server should be the object that links up different components of the server.
 *
 * To prevent cyclic dependency, instead of passing the Server object around, pass the objects that will actually be used, e.g. the logger, the config, etc.
 */
interface Server {
	/**
	 * the server config.
	 */
	val config: CoreConfig
	/**
	 * the logger used for the server context. Plugins should use their own logger instead of this one.
	 */
	val logger: Logger

	/**
	 * the core i18n provider
	 */
	val lang: CoreLang

	/**
	 * Returns the default locale of the server.
	 */
	val defaultLocale: String

	/**
	 * the server scope, which only gets disposed when the server shuts down.
	 */
	val scope: Scope

	/**
	 * the feature graph of the server. "Events" should be handled via the feature graph.
	 */
	val features: FeatureGraph
}
