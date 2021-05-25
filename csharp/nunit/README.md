# Codurance :: Katalyst Kickstart

## .NET Scaffold Project

This is the .NET Core scaffold for the Katalyst Kickstart project. The package contains
a very simple `Calculator` class that takes in a `params int[]` list of arguments and 
performs a `+=` on each in turn, returning the overall result. Alongside this class is a very
basic test that simply asserts the result of adding two of these arguments together is correct.

## Getting Started on Windows / Visual Studio

Ensure you have the latest .NET Core framework installed - if you use [Chocolatey](https://chocolatey.org/) then you can run 
`choco install dotnetcore-sdk` to satisfy this prerequisite -  and simply clone the project. When cloned
you can open the *.sln file with your installed version of Visual Studio.

## Getting Started on Mac OSX / Visual Studio Code

Ensure you have the latest .NET Core framework installed - if you use [Homebrew](https://brew.sh/) then you can run 
`brew install --cask dotnet-sdk` to satisfy this prerequisite -  and simply clone the project. When cloned you 
can `cd` to the directory you cloned to and run `code .` to open the solution.

## Dependency Management

Dependencies are saved within the relevant .csproj file and can be added/removed by editing this file directly or 
by using the CLI with `dotnet [add|remove] package <name>`. The packages in use at the moment are...

```
<ItemGroup>
  <PackageReference Include="Microsoft.NET.Test.Sdk" Version="16.6.1" />
  <PackageReference Include="NUnit" Version="3.13.2" />
  <PackageReference Include="NUnit3TestAdapter" Version="3.17.0" />
  <PackageReference Include="coverlet.collector" Version="1.3.0" />
</ItemGroup>
```