.PHONY: clean

clean:
	rm -r build \
		graphmine-cli/build \
		graphmine-core/build \
		graphmine-i18n/build \
		graphmine-i18n-core/build \
		graphmine-util/build \
		util-math/build \
		util-reflect-io/build \
		2>/dev/null
