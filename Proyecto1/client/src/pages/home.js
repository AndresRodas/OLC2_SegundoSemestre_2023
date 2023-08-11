import React from 'react';
import { useState } from 'react';
import { InputTextarea } from 'primereact/inputtextarea';
import { Button } from 'primereact/button';

import { PostMethod } from '../api/http';

const Home = () => {

    const [codeText, setCodeText] = useState('')
    const [consoleText, setConsoleText] = useState('')

    const CompileVisitor = async() => {
        const data = {
            Content: codeText
          }
        const resp = await PostMethod('http://127.0.0.1:3002'+'Interpreter', data)
        await setConsoleText(resp?.Output)
    }

    const CompileInterpreter = async() => {
        const data = {
            Content: codeText
          }
        const resp = await PostMethod('http://127.0.0.1:3002'+'Interpreter', data)
        await setConsoleText(resp?.Output)
    }

    return (
        <div>
            <div style={{display: 'flex'}}>
                <InputTextarea value={codeText} rows={8} cols={40} style={{marginBottom: '5%', marginRight: '2%'}} onChange={e => {setCodeText(e.target.value)}}/>
                <InputTextarea value={consoleText} rows={8} cols={40} style={{marginBottom: '5%', marginLeft: '2%'}} onChange={e => {setConsoleText(e.target.value)}}/>
            </div>
            <Button label="RUN" onClick={CompileVisitor} />
            {/* <Button label="RUN" onClick={CompileInterpreter} /> */}
        </div>
    );
};

export default Home;
