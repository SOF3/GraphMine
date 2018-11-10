package io.github.sof3.graphmine.command

import io.github.sof3.graphmine.command.args.CommandArg
import io.github.sof3.graphmine.feature.FeatureNodeInstance
import io.github.sof3.graphmine.i18n.JointI18nable

abstract class CommandOverload<
		Self : CommandOverload<Self, Cmd>,
		Cmd : Command<Cmd, Self>>
(val cmd: Cmd) : FeatureNodeInstance<Self, Cmd> {
	override val node get() = cmd

	internal val args = mutableListOf<CommandArg<*>.Wrapper>()
	fun getArgs() = args as List<CommandArg<*>.Wrapper>

	lateinit var alias: String
		internal set

	fun express(): JointI18nable = TODO()
//			JointI18nable(" ".i18n, *(args.map {
//		val ret = "${it.name}: ${it.arg.typeName}"
//		if(it.arg.optional){
//			if(it.arg.defaultConstant != null)
//				"[$ret = ${it.arg.defaultConstant}]"
//			else
//				"[$ret]"
//		}else{
//			"<$ret>".i18n
//		}
//	}.toTypedArray()))
//		return args.joinToString(separator = " ") {
//
//		}
//	}
}
