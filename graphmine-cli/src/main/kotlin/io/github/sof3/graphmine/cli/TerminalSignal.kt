package io.github.sof3.graphmine.cli

/**
 * Any signals received from the abstract console are expressed as a [TerminalSignal].
 */
sealed class TerminalSignal {
	/**
	 * Represents an EOD (end of data) signal, implying that the input is closed
	 */
	object Eod : TerminalSignal()

	/**
	 * Represents a SIGINT or otherwise force-shutdown signal.
	 */
	object Int : TerminalSignal()

	/**
	 * Represents a line of command
	 * @property line the command line with line endings trimmed
	 */
	class Cmd(val line: String) : TerminalSignal()
}
