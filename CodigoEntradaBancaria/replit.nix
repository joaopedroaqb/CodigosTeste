{ pkgs }: {
	deps = [
        pkgs.luajitPackages.luarocks
        pkgs.lua
        pkgs.sumneko-lua-language-server
	];
}