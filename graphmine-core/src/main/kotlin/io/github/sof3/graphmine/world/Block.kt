package io.github.sof3.graphmine.world

import io.github.sof3.graphmine.feature.FeatureNode
import io.github.sof3.graphmine.feature.FeatureNodeInstance

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
 * Represents a block type.
 *
 * This class is only used as a wrapper for the block ID along with FeatureNode identification. In other words, it can
 * be said that this class only exists for documentation purpose.
 */
data class Block(
		/**
		 * The block ID. This may be changed in the future.
		 */
		val id: Int
) : FeatureNode<Block, BlockInstance>

/**
 * Represents a block type at a certain location. The existence persistence of this block is irrelevant to whether the
 * block is really at the location, ever at the location or has been removed. This is a pure value class.
 */
data class BlockInstance(
		/**
		 * the block type
		 */
		val block: Block,
		/**
		 * the expected location of the block
		 */
		val location: BlockLocation
) : FeatureNodeInstance<BlockInstance, Block> {
	override val node get() = block
}
